package com.jakubkolacz.qualificationTask.repository;

import com.jakubkolacz.qualificationTask.domain.dao.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
