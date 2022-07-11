package com.athena.core.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AthenaPatientRequest {

    private int practiceId;

    private String searchType;

    private String searchItem;
}
