package com.archicode.petclinic.services.map;

import com.archicode.petclinic.model.Visit;
import com.archicode.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kozlowski (created on 15.10.2018)
 */
@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

}
