package com.athena.core.dto.athena.response.athenappointment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Appointmentcopay {

    private int collectedforother;

    private int collectedforappointment;

    private int insurancecopay;
}
