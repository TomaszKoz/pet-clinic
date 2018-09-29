package com.archicode.petclinic.services;

import com.archicode.petclinic.model.Owner;

/**
 * @author Tomasz.Kozlowski (created on 28.09.2018)
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
