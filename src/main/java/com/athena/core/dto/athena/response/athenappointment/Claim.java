package com.athena.core.dto.athena.response.athenappointment;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Claim {


    public String appointmentid;
    public String billedproviderid;
    public String billedservicedate;
    public String chargeamount;
    public String claimcreateddate;
    public String claimid;
    public ArrayList<Diagnosis> diagnoses;
    public String patientpayer;
    public String primaryinsurancepayer;
    public ArrayList<Procedure> procedures;
    public int referringproviderid;
    public String secondaryinsurancepayer;
    public String transactiondetails;
    public String transactionid;

}
