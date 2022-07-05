package com.athena.core.dto.athena.response.athenainsurance;

import lombok.Data;

import java.util.List;

@Data
public class AthenaInsurancesList {

    private List<AthenaInsurancesResponse> insurances;
}
