package com.athena.core.dto.response.appointment;

import lombok.Data;

import java.util.List;

@Data
public class AthenaAppointmentsList {

    private List<AthenaAppointmentsResponse> appointments;

}
