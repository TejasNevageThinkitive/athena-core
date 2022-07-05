package com.athena.core.dao;


import com.athena.core.model.CoverMeAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverMeAuditRepository extends JpaRepository<CoverMeAudit,Integer> {

}
