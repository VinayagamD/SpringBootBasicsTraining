package com.vinaylogics.sfgpetclinic.data.services;

import com.vinaylogics.sfgpetclinic.data.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
