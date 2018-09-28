package com.archicode.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Tomasz.Kozlowski (created on 28.09.2018)
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private Long id;

}
