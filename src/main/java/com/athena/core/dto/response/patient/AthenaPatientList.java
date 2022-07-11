package com.athena.core.dto.response.patient;

import lombok.Data;

import java.util.List;

@Data
public class AthenaPatientList {

    private List<AthenaPatientSearchResponse> patients;
}
