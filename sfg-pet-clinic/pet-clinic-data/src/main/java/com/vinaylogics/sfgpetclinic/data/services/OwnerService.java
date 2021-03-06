package com.vinaylogics.sfgpetclinic.data.services;

import com.vinaylogics.sfgpetclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
