package com.athena.core.dto.response.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AthenaSearchPatientResponse {

    public String departmentid;
    public boolean driverslicense;
    public String zip;
    public boolean guarantoraddresssameaspatient;
    public boolean portaltermsonfile;
    public String status;
    public String lastname;
    public String lastappointment;
    public boolean privacyinformationverified;
    public String primarydepartmentid;
    public List<AthenaSearchBalance> balances;
    public List<Object> race;
    public String firstappointment;
    public String primaryproviderid;
    public boolean patientphoto;
    public String patientphotourl;
    public String registrationdate;
    public String firstname;
    public String state;
    public String patientid;
    public String dob;
    public String guarantorrelationshiptopatient;
    public String address1;
    public String countrycode;
    public boolean consenttotext;
    public String countrycode3166;
}
