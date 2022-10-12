package com.athena.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaPatientLocationResponse {

    private Boolean defaultoncheckin;
    private String patientlocationid;
    private String name;

}
