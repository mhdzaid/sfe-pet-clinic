package guru.springframework.sfepetclinic.services;

import guru.springframework.sfepetclinic.model.Pet;

import java.util.Set;

public interface PetService {



    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
