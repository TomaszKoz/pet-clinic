package com.archicode.petclinic.repositories;

import com.archicode.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Tomasz.Kozlowski (created on 14.10.2018)
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
