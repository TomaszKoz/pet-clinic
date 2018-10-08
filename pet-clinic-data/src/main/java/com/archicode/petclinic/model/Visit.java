package com.archicode.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author Tomasz Kozlowski (created on 08.10.2018)
 */
@Getter
@Setter
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;

}
