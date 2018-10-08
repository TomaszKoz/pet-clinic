package com.archicode.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author Tomasz.Kozlowski (created on 27.09.2018)
 */
@Getter
@Setter
public class Owner extends Person {

    private Set<Pet> pets;

}
