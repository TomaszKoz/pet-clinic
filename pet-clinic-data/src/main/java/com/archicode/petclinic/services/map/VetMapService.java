package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Vet;
import com.archicode.petclinic.services.SpecialityService;
import com.archicode.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kozlowski (created on 29.09.2018)
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    @Autowired
    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet vet) {
        if (vet != null) {
            if(vet.getSpecialities() != null) {
                vet.getSpecialities().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        specialityService.save(speciality);
                    }
                });
            }
            return super.save(vet);
        } else {
            return null;
        }
    }
}
