package com.athena.core.dto.response.patient;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Chargeleveldetail {

    public int amount;
    public String description;
    public int id;
    public String procedurecode;
    public String procedurecodeothermodifier;
    public String procedurecodesubmitted;
    public String servicedate;
    public ArrayList<Transaction> transactions;
}
