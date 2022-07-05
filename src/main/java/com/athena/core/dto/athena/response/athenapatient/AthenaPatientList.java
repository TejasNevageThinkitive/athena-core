package com.athena.core.dto.athena.response.athenapatient;

import lombok.Data;

import java.util.List;

@Data
public class AthenaPatientList {

    private List<AthenaPatientSearchResponse> patients;
}
