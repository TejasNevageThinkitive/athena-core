package com.athena.core.repository;


import com.athena.core.model.AthenaAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AthenaAuditRepository  extends JpaRepository<AthenaAudit,Integer> {

    List<AthenaAudit>  getAthenaAuditByParentId(UUID uuid);

}


