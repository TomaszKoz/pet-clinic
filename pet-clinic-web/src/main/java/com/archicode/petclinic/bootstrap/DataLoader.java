package com.archicode.petclinic.bootstrap;

import com.archicode.petclinic.model.Owner;
import com.archicode.petclinic.model.Pet;
import com.archicode.petclinic.model.PetType;
import com.archicode.petclinic.model.Vet;
import com.archicode.petclinic.services.OwnerService;
import com.archicode.petclinic.services.PetTypeService;
import com.archicode.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Tomasz Kozlowski (created on 03.10.2018)
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) {
        PetType dog = new PetType();
        dog.setName("Dog");
        dog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        cat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Marston");
        owner1.setAddress("123 Ranch St.");
        owner1.setCity("Blackwater");
        owner1.setTelephone("555 436 434");
        ownerService.save(owner1);

        Pet owner1Pet = new Pet();
        owner1Pet.setName("Rufus");
        owner1Pet.setPetType(dog);
        owner1Pet.setBirthDate(LocalDate.now());
        owner1Pet.setOwner(owner1);
        owner1.getPets().add(owner1Pet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nathan");
        owner2.setLastName("Drake");
        owner1.setAddress("56 Beach Av.");
        owner1.setCity("Long Island");
        owner1.setTelephone("555 757 783");
        ownerService.save(owner2);

        Pet owner2Pet = new Pet();
        owner2Pet.setName("Pirate");
        owner2Pet.setPetType(cat);
        owner2Pet.setBirthDate(LocalDate.now());
        owner2Pet.setOwner(owner2);
        owner2.getPets().add(owner2Pet);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("John");
        vet1.setLastName("Doe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lara");
        vet2.setLastName("Croft");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }

}
