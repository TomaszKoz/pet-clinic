package com.archicode.petclinic.services.jpa;

import com.archicode.petclinic.model.Owner;
import com.archicode.petclinic.repositories.OwnerRepository;
import com.archicode.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tomasz.Kozlowski (created on 14.10.2018)
 */
@Service
@Profile("springDataJpa")
public class OwnerJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLikeIgnoreCase(lastName);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

}
