package com.athena.core.dto.athena.request;


import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AthenaAppointmentRequest {

    private int practiceId;

    private int patientId;

    private Boolean showCancelled;

    private Boolean showPast;
}
