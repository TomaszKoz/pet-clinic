package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.PetType;
import com.archicode.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kozlowski (created on 08.10.2018)
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
