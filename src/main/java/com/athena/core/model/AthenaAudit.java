package com.athena.core.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "athena_audit")
public class AthenaAudit {

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

    private UUID parentId;

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

