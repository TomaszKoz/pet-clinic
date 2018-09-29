package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet, Long> {

    @Override
    public Vet save(Vet vet) {
        return save(vet.getId(), vet);
    }

}
