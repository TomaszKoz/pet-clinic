package com.archicode.petclinic.services;

import com.archicode.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Tomasz.Kozlowski (created on 28.09.2018)
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
