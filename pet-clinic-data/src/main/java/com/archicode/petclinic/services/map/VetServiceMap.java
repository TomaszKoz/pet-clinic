package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Vet;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> {

    @Override
    public Vet save(Vet vet) {
        return save(vet.getId(), vet);
    }

}
