package com.athena.core.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class DataConfig {

	private static final Long initialInterval = 100L;
	private static final Integer maxAttempts = 10;

	public RetryTemplate createRetryOnOptimisticLockTemplate() {
		return createRetryTemplate(ObjectOptimisticLockingFailureException.class);
	}

	public RetryTemplate createRetryTemplate(Class<? extends Throwable> ex) {
		Map<Class<? extends Throwable>, Boolean> exceptions = new HashMap<>();
		exceptions.put(ex, true);

		RetryTemplate template = new RetryTemplate();
		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy(maxAttempts, exceptions);
		template.setRetryPolicy(retryPolicy);

		ExponentialBackOffPolicy backOffPolicy = new ExponentialBackOffPolicy();
		backOffPolicy.setInitialInterval(initialInterval);
		template.setBackOffPolicy(backOffPolicy);

		return template;
	}

	@Configuration
	@EnableTransactionManagement
	@EnableJpaRepositories(basePackages = { "com.athena.core.dao" ,"com.inetgration.ehr.data.repository"})
	public class MainDbConfig {

		@Value("${spring.datasource.driver-class-name}")
		private String driver;
		@Value("${spring.datasource.url}")
		private String url;
		@Value("${spring.datasource.username}")
		private String username;
		@Value("${spring.datasource.password}")
		private String password;

		@Primary
		@Bean(name = "dataSource")
		@ConfigurationProperties(prefix = "spring.datasource.hikari")
		public DataSource dataSource() {
			return DataSourceBuilder.create()
					.driverClassName(driver)
					.url(url)
					.username(username)
					.password(password)
					.build();
		}

		@Primary
		@Bean(name = "entityManagerFactory")
		public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
				@Qualifier("dataSource") DataSource dataSource) {
			return builder.dataSource(dataSource).packages("com.athena.core.model","com.inetgration.ehr.data.model").persistenceUnit("main")
					.properties(jpaProperties()).build();
		}

		@Primary
		@Bean(name = "transactionManager")
		public PlatformTransactionManager transactionManager(
				@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
			return new JpaTransactionManager(entityManagerFactory);
		}
	}

	protected Map<String, Object> jpaProperties() {
		Map<String, Object> props = new HashMap<>();
		props.put("hibernate.physical_naming_strategy", SpringPhysicalNamingStrategy.class.getName());
		props.put("hibernate.implicit_naming_strategy", SpringImplicitNamingStrategy.class.getName());
		return props;
	}
}