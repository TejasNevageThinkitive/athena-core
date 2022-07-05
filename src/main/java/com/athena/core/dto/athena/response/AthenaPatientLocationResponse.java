package com.athena.core.dto.athena.response;

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
    private int patientlocationid;
    private String name;

}
