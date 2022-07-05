package com.athena.core.dto.athena.response.athenaencounter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Icdcode {

    public String code;
    public String codeset;
    public String description;

}
