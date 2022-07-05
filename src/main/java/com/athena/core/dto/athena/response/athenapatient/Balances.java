package com.athena.core.dto.athena.response.athenapatient;

import lombok.Data;

@Data
public class Balances {

    private String balance;
    private String departmentlist;
    private int providergroupid;
    private boolean cleanbalance;
}
