package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Vet;
import com.archicode.petclinic.services.VetService;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet vet) {
        return save(vet.getId(), vet);
    }

}
