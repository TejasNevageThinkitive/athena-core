package com.athena.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EHRSetting {

    private int id;

    private String EHR;

    private String organizationId;

    private String clientId;

    private String clientSecrete;

    private String pemFileData;

}
