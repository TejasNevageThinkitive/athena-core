package com.athena.core.dto.athena.response.athenappointment;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Procedure {

    public String allowableamount;
    public String allowablemax;
    public String allowablemin;
    public String chargeamount;
    public String procedurecategory;
    public String procedurecode;
    public String proceduredescription;
    public String transactionid;
}
