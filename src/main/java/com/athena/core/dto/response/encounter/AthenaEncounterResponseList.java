package com.athena.core.dto.response.encounter;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaEncounterResponseList {

    private List<AthenaEncounterResponse> encounters;
}
