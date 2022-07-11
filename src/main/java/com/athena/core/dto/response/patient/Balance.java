package com.athena.core.dto.response.patient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Balance {

    public String balance;
    public String cleanbalance;
    public String collectionsbalance;
    public ArrayList<Contract> contracts;
    public String departmentlist;
    public String paymentplanbalance;
    public int providergroupid;

}
