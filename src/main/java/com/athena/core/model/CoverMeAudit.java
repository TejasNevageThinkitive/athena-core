package com.athena.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cover_me_audit")
public class CoverMeAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String requestMethod;

    private String requestUrl;

    private String requestBody;

    private String responseCode;

    private String responseBody;

    private Date created;

    private Date modified;

    private UUID transactionId;

    @Transient
    private List<AthenaAudit> athenaAuditList;

    @PrePersist
    public void prePersist() {
        this.created = new Date();
        this.modified = new Date();
    }


    @PreUpdate
    public void preUpdate() {
        this.modified = new Date();
    }

}
