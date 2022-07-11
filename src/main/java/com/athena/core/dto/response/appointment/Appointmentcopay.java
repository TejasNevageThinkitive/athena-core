package com.athena.core.dto.response.appointment;

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
