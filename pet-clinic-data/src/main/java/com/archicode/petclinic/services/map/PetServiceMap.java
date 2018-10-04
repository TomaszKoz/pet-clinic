package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Pet;
import com.archicode.petclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
