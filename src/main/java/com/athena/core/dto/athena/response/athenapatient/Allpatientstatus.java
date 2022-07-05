package com.athena.core.dto.athena.response.athenapatient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Allpatientstatus {

    public int departmentid;
    public String primaryproviderid;
    public String status;

}
