package com.athena.core.dto.response.insurance;

import lombok.Data;

import java.util.List;

@Data
public class AthenaInsurancesList {

    private List<AthenaInsurancesResponse> insurances;
}
