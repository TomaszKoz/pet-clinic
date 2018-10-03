package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Owner;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        return save(owner.getId(), owner);
    }

}
