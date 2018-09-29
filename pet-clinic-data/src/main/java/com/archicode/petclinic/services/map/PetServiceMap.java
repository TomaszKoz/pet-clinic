package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet, Long> {

    @Override
    public Pet save(Pet pet) {
        return save(pet.getId(), pet);
    }

}
