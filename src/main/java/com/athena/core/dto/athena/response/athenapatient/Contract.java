package com.athena.core.dto.athena.response.athenapatient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contract {

    public String availablebalance;
    public String contractclass;
    public String maxamount;
}
