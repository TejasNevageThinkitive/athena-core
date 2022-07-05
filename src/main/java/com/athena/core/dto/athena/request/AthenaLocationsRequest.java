package com.athena.core.dto.athena.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AthenaLocationsRequest {

    private int practiceId;

    private  String departmentId;
}
