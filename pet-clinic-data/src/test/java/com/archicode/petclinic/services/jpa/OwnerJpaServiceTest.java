package com.archicode.petclinic.services.jpa;

import com.archicode.petclinic.model.Owner;
import com.archicode.petclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Tomasz Kozlowski (created on 20.10.2018)
 */
@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    @InjectMocks
    private OwnerJpaService ownerService;
    @Mock
    private OwnerRepository ownerRepository;

    private Owner returnOwner;

    private final static String LAST_NAME = "Smith";

    @BeforeEach
    void setUp() {
        returnOwner = new Owner();
        returnOwner.setId(1L);
        returnOwner.setLastName(LAST_NAME);
    }

    @Test
    void findByLastName() {
        Owner returnOwner = new Owner();
        returnOwner.setId(1L);
        returnOwner.setLastName(LAST_NAME);
        Set<Owner> returnedOwners = new HashSet<>();
        returnedOwners.add(returnOwner);


        when(ownerRepository.findAllByLastNameLikeIgnoreCase(any()))
                .thenReturn(returnedOwners);

        Set<Owner> owners = ownerService.findAllByLastNameLike(LAST_NAME);
        assertEquals(owners.size(), 1);
        verify(ownerRepository).findAllByLastNameLikeIgnoreCase(any());
    }

    @Test
    void save() {
        when(ownerRepository.save(any())).thenReturn(returnOwner);
        Owner savedOwner = ownerService.save(new Owner());
        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerService.findById(1L);
        assertNotNull(owner);
    }

    @Test
    void findAll() {
        Set<Owner> returnOwners = new HashSet<>();
        returnOwners.add(new Owner());
        returnOwners.add(new Owner());

        when(ownerRepository.findAll()).thenReturn(returnOwners);

        Set<Owner> owners = ownerService.findAll();
        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void delete() {
        ownerService.delete(returnOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        ownerService.deleteById(1L);
        verify(ownerRepository).deleteById(any());
    }

}