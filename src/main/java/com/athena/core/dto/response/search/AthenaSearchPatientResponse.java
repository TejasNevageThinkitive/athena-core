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


    public boolean hasmobile;

    public String contactpreference_appointment_email;
    public String contactpreference_appointment_sms;
    public String contactpreference_billing_phone;
    public String ethnicitycode;
    public String contactpreference_announcement_phone;
    public String contactpreference_lab_sms;
    public String ssn;
    public String middlename;
    public String contactpreference_lab_email;
    public String contactpreference_announcement_sms;
    public String emailexistsyn;
    public String emailexists;
    public String language6392code;
    public String contactpreference_billing_email;
    public String contactpreference_announcement_email;
    public String contactpreference_appointment_phone;
    public String contactpreference_billing_sms;
    public String contactpreference_lab_phone;
    public String contactpreference;
    public String onlinestatementonlyyn;
    public String onlinestatementonly;

    public String veteran;
    public String suffix;
    public String schoolbasedhealthcenter;
    public String referralsourceid;
    public String publichousing;
    public String preferredname;
    public String povertylevelincomerangedeclined;
    public String povertylevelincomeperpayperiod;
    public String povertylevelincomepayperiod;
    public String povertylevelincomedeclined;
    public String povertylevelfamilysizedeclined;
    public String povertylevelfamilysize;
    public String povertylevelcalculated;
    public String portalstatus;
    public String portalsignatureonfile;
    public String patientphotoyn;
    public String occupationcode;
    public String nextkinrelationship;
    public String nextkinphone;
    public String mobilephone;
    public String mobilecarrierid;
    public String medicationhistoryconsentverified;
    public String industrycode;
    public String homelesstype;
    public String homeless;
    public String homeboundyn;
    public String guardiansuffix;
    public String guardianmiddlename;
    public String guardianlastname;
    public String guardianfirstname;
    public String guarantorsuffix;
    public String guarantormiddlename;
    public String guarantoremployerid;
    public String guarantoraddress1;
    public String guarantoraddress2;
    public String employerzip;
    public String employerstate;
    public String employerphone;
    public String employername;
    public String employerid;
    public String employerfax;
    public String employercity;
    public String employeraddress;
    public String driverslicenseyn;
    public String driverslicenseurl;
    public String driverslicensestateid;
    public String driverslicensenumber;
    public String driverslicenseexpirationdate;
    public String donotcallyn;
    public String defaultpharmacyncpdpid;
    public String deceaseddate;
    public String contactrelationship;
    public String contactname;
    public String contactmobilephone;
    public String contacthomephone;
    public String confidentialitycode;
    public String claimbalancedetails;
    public String agriculturalworker;
    public String agriculturalworkertype;
}
