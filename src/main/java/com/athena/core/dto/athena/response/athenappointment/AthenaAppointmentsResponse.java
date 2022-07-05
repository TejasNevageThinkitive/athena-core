package com.athena.core.dto.athena.response.athenappointment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AthenaAppointmentsResponse {

        public String appointmentcancelreasonid;
        public Appointmentcopay appointmentcopay;
        public String appointmentid;
        public String appointmentstatus;
        public String appointmenttype;
        public String appointmenttypeid;
        public String cancelleddate;
        public List<Claim> claims;
        public String copay;
        public String date;
        public String departmentid;
        public int duration;
        public String frozenyn;
        public int hl7providerid;
        public List<Insurance> insurances;
        public String patient;
        public String patientappointmenttypename;
        public String patientid;
        public String providerid;
        public int referringproviderid;
        public int renderingproviderid;
        public String rescheduledappointmentid;
        public String startcheckin;
        public String starttime;
        public String stopcheckin;
        public int supervisingproviderid;
        public String urgentyn;
        public List<Useexpectedprocedurecode> useexpectedprocedurecodes;
}