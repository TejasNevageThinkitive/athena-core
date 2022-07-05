package com.athena.core.dto.athena.response.athenappointment;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis {

    public String deleteddiagnosis;
    public String diagnosiscategory;
    public String diagnosiscodeset;
    public String diagnosisdescription;
    public String diagnosisid;
    public String diagnosisrawcode;

}
