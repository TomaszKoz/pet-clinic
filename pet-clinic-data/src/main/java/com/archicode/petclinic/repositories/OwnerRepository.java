package com.archicode.petclinic.repositories;

import com.archicode.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Tomasz.Kozlowski (created on 14.10.2018)
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
