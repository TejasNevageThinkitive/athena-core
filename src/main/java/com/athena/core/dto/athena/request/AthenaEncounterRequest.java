package com.athena.core.dto.athena.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AthenaEncounterRequest {

    private int practiceId;

    private int patientId;

    private String departmentId;

}
