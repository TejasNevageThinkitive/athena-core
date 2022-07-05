package com.athena.core.dto.athena.response.athenapatient;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Claimdetail {

    public int amount;
    public ArrayList<Chargeleveldetail> chargeleveldetail;
    public int claimid;
    public String cleanbalance;
    public int departmentid;
    public int patientbalance;
    public String servicedate;
    public int supervisingproviderid;
}
