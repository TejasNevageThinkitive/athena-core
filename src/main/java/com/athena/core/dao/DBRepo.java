package com.athena.core.dao;

import com.athena.core.model.RootEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DBRepo extends JpaRepository<RootEntity, Long> {

    @Query(value = "select * from ehr_setting where organization_id = :orgId and ehr = 'ATHENA'", nativeQuery = true)
    Object[][] getDataFromDatabase(String orgId);


}
