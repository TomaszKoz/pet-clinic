package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Speciality;
import com.archicode.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz.Kozlowski (created on 09.10.2018)
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
