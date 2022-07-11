package com.athena.core.dto.response.encounter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis {

    public String description;
    public int diagnosisid;
    public ArrayList<Icdcode> icdcodes;
    public String note;
    public int snomedcode;
}
