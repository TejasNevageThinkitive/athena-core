package com.athena.core.dto.athena.response.athenapatient;

import lombok.Data;

@Data
public class AthenaPatientSearchResponse {

    private String firstname;
    private int currentdepartmentid;
    private String providergroupid;
    private String lastname;
    private String middleinitial;
    private String namesuffix;
    private String maritalstatus;
    private int unappliedamount;
    private String localpatientid;
    private int contextid;
    private String state;
    private String city;
    private String ssn;
    private String blockpatientyn;
    private String countryid;
    private String homephone;
    private String mobilephone;
    private int patientid;
    private String sex;
    private String dob;
    private String translatedhomephoneindex;
    private String zip;
    private String currentdepartment;
    private String address1;
    private int outstandingp;
    private String preferredname;
    private String previouslastname;
}
