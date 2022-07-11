package com.athena.core.dto.response.patient;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaPatientDemographicsResponseList {

    private List<AthenaPatientDemographicsResponse> athenaPatientDemographicsResponseList;
}
