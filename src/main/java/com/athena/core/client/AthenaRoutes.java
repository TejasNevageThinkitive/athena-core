package com.athena.core.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@Slf4j
public class AthenaRoutes {

    private final String url;

    public AthenaRoutes(@Value("${athena.url}") final String url){
        this.url = url;
    }

    public URI searchPatients(int practiceId,String searchType,String searchTerm){
        return UriComponentsBuilder.fromHttpUrl(url)
                .path("/{practiceId}/patients/search")
                .queryParam("searchtype",searchType)
                .queryParam("searchterm",searchTerm)
                .build(practiceId);
    }

    public URI pullPatientsLocation(int practiceId,int departmentId ){
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

    public URI pullEncounter(int practiceId, int patientId,int departmentId){
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
