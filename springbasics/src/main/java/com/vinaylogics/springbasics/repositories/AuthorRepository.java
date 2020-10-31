package com.vinaylogics.springbasics.repositories;

import com.vinaylogics.springbasics.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository  extends JpaRepository<Author, Long> {
}
