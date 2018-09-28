package com.archicode.petclinic.services;

import com.archicode.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Tomasz.Kozlowski (created on 28.09.2018)
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
