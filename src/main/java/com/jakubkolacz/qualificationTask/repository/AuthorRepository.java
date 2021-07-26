package com.jakubkolacz.qualificationTask.repository;

import com.jakubkolacz.qualificationTask.domain.dao.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findById(Long id);
}
