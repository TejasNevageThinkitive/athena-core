package com.athena.core.dto.athena.response.athenapatient;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Claimbalancedetail {

    public ArrayList<Claimdetail> claimdetails;

    public String departmentids;

    public int providergroupid;
}
