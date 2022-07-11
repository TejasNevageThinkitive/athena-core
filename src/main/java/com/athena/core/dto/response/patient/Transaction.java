package com.athena.core.dto.response.patient;

import lombok.Data;

@Data
public class Transaction {

    public int amount;
    public String date;
    public int description;
    public int epaymentid;
    public int id;
    public String transfertype;
    public String type;
}
