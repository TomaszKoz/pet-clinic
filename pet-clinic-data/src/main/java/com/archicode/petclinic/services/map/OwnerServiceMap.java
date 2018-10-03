package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Owner;
import com.archicode.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner owner) {
        return save(owner.getId(), owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

}
