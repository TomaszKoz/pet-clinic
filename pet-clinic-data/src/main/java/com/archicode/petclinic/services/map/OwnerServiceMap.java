package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        return save(owner.getId(), owner);
    }

}
