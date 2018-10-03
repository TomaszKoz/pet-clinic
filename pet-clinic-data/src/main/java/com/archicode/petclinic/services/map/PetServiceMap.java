package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Pet;
import com.archicode.petclinic.services.PetService;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet pet) {
        return save(pet.getId(), pet);
    }

}
