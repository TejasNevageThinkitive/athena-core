package com.athena.core.dto.athena.response.athenappointment;

import lombok.Data;

import java.util.List;

@Data
public class AthenaAppointmentsList {

    private List<AthenaAppointmentsResponse> appointments;

}
