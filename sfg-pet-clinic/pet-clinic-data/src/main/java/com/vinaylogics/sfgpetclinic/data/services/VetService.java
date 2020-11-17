package com.vinaylogics.sfgpetclinic.data.services;

import com.vinaylogics.sfgpetclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet pet);

    Set<Vet> findAll();
}
