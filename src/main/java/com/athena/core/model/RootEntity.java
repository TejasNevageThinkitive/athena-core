package com.athena.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ehr_setting")
public class RootEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
