package guru.springframework.sfepetclinic.services;

import guru.springframework.sfepetclinic.model.Vet;

import java.util.Set;

public interface VetService {



    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
