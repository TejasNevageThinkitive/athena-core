package com.athena.core.dto.athena.response.athenasearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaSearchBalance {
    public String balance;
    public String departmentlist;
    public int providergroupid;
    public boolean cleanbalance;
}
