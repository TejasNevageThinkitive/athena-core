package com.athena.core.dto.response.provider;

import lombok.Data;

@Data
public class AthenaProvidersResponse {

    private Boolean acceptingnewpatients;
    private Boolean hideinportal;
    private Boolean createencounteroncheckin;
    public String acceptingnewpatientsyn;
    public String ansinamecode;
    public String ansispecialtycode;
    public String billable;
    public String createencounteroncheckinyn;
    public String createencounterprovideridlist;
    public String displayname;
    public String entitytype;
    public String federalidnumber;
    public String firstname;
    public String hideinportalyn;
    public String homedepartment;
    public String lastname;
    public int npi;
    public String otherprovideridlist;
    public String personalpronouns;
    public String providergrouplist;
    public int providerid;
    public String providertype;
    public String providertypeid;
    public String providerusername;
    public String scheduleresourcetype;
    public String schedulingname;
    public String sex;
    public String specialty;
    public int specialtyid;
    public int supervisingproviderid;
    public String supervisingproviderusername;
    public int usualdepartmentid;
}


