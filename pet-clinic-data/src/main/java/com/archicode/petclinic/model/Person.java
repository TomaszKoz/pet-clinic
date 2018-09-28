package com.archicode.petclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Tomasz.Kozlowski (created on 27.09.2018)
 */
@Getter
@Setter
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

}
