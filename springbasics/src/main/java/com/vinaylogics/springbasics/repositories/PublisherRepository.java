package com.vinaylogics.springbasics.repositories;

import com.vinaylogics.springbasics.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
