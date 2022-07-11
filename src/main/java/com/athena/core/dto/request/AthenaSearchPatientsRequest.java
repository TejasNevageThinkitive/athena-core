package com.athena.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaSearchPatientsRequest {

    private int practiceId;

    private String firstName;

    private String lastName;

    private String dob;
}
