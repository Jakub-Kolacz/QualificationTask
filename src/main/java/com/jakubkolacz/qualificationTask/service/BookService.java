package com.jakubkolacz.qualificationTask.service;

import com.jakubkolacz.qualificationTask.domain.dao.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Book save(Book book);

    Page<Book> getPage(Pageable pageable);
}
