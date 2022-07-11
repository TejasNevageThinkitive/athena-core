package com.athena.core.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AthenaInsuranceRequest {

    private int practiceId;

    private int patientId;
}
