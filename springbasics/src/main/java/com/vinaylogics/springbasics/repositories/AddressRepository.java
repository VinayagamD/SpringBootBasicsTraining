package com.vinaylogics.springbasics.repositories;

import com.vinaylogics.springbasics.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
