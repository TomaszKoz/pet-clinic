package com.archicode.petclinic.bootstrap;

import com.archicode.petclinic.model.Owner;
import com.archicode.petclinic.model.Vet;
import com.archicode.petclinic.services.OwnerService;
import com.archicode.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Tomasz Kozlowski (created on 03.10.2018)
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Marston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Nathan");
        owner2.setLastName("Drake");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Doe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lara");
        vet2.setLastName("Croft");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }

}
