package com.athena.core.dto.response.encounter;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AthenaEncounterResponse {

    public int appointmentid;
    public String closeddate;
    public String closeduser;
    public int departmentid;
    public ArrayList<Diagnosis> diagnoses;
    public String encounterdate;
    public int encounterid;
    public String encountertype;
    public String encountervisitname;
    public String lastreopened;
    public String lastupdated;
    public String patientlocation;
    public int patientlocationid;
    public String patientstatus;
    public int patientstatusid;
    public String providerfirstname;
    public int providerid;
    public String providerlastname;
    public String providerphone;
    public String stage;
    public String status;
}
