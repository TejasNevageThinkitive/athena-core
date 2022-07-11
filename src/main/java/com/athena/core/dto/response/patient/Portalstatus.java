package com.athena.core.dto.response.patient;

import lombok.Data;

@Data
public class Portalstatus {

    public String blockedfailedloginsyn;
    public String entitytodisplay;
    public String familyblockedfailedloginsyn;
    public String familyregisteredyn;
    public String lastlogindate;
    public String lastloginentity;
    public String noportalyn;
    public String portalregistrationdate;
    public String registeredyn;
    public String status;
    public String termsaccepted;
}
