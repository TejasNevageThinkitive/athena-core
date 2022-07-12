package com.athena.core.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@Slf4j
public class AthenaRoutes {

//    @Value("${athena.url}")
//    private String url;
    private String url ="https://api.preview.platform.athenahealth.com/v1";

    public URI searchPatients(int practiceId,String searchType,String searchTerm){
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceId}/patients/search")
                .queryParam("searchtype",searchType)
                .queryParam("searchterm",searchTerm)
                .build(practiceId);
    }

    public URI pullPatientsLocation(int practiceId,String departmentId ){
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/chart/configuration/patientlocations")
                .queryParam("departmentid",departmentId)
                .build(practiceId);
    }

    public URI pullProviders(int practiceId){
        log.info("Get list of Athena Provider URI");
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/providers")
                .build(practiceId);
    }

    public URI pullInsurances(int practiceId, int patientId){
         return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/patients/{patientid}/insurances")
                .build(practiceId,patientId);

    }

    public URI pullPatientDemographics(int practiceId,int patientId ){
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/patients/{patientid}")
                .build(practiceId,patientId);
    }

    public URI pullAppointment(int practiceId, int patientId, boolean showCancelled, boolean showPast) {
       return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/patients/{patientid}/appointments")
                .queryParam("showcancelled",showCancelled)
                .queryParam("showpast",showPast)
                .build(practiceId,patientId);
    }

    public URI pullEncounter(int practiceId, int patientId,String departmentId){
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/chart/{patientid}/encounters")
                .queryParam("departmentid",departmentId)
                .build(practiceId,patientId);
    }

    public URI pullPatients(int practiceId,String firstName,String lastName,String dob){
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/patients/enhancedbestmatch")
                .queryParam("firstname",firstName)
                .queryParam("lastname",lastName)
                .queryParam("dob",dob)
                .build(practiceId);
    }


    public URI pullSearchPatient(int practiceId,String firstName,String lastName,String dob){
       return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceid}/patients")
                .queryParam("firstname",firstName)
                .queryParam("lastname",lastName)
                .queryParam("dob",dob)
                .build(practiceId);
    }

}
