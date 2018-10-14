package com.archicode.petclinic.repositories;

import com.archicode.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Tomasz.Kozlowski (created on 14.10.2018)
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
