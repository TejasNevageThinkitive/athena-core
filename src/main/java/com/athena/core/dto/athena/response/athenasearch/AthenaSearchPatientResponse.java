package com.athena.core.dto.athena.response.athenasearch;

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
    public String racename;
    public String address2;
    public String notes;
    public String guarantordob;
    public String guarantorfirstname;
    public String city;
    public String guarantoremail;
    public String email;

    public String homephone;
    public String lastemail;
    public String sex;

    public String consenttocall;
    public String hasmobileyn;
    public String caresummarydeliverypreference;
    public String guarantorlastname;
    public String guarantorcountrycode;
    public String guarantorphone;
    public String maritalstatus;
    public String maritalstatusname;
    public String guarantorcountrycode3166;

    public String guarantorstate;
    public String portalaccessgiven;
    public String nextkinname;
    public String guarantorssn;
    public String guarantorcity;
    public String guarantorzip;

    public String hierarchicalcode;


}
