package com.archicode.petclinic.services;

import com.archicode.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Tomasz.Kozlowski (created on 28.09.2018)
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Set<Owner> findAllByLastNameLike(String lastName);

}
