package com.archicode.petclinic.services;

import com.archicode.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Tomasz.Kozlowski (created on 28.09.2018)
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
