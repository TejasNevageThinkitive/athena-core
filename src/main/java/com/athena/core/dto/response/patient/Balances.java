package com.athena.core.dto.response.patient;

import lombok.Data;

@Data
public class Balances {

    private String balance;
    private String departmentlist;
    private int providergroupid;
    private boolean cleanbalance;
}
