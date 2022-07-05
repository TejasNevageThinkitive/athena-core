package com.athena.core.dto.athena.response.athenasearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaSearchListResponse {

    private String next;
    private List<AthenaSearchPatientResponse> patients;
}

