package com.jakubkolacz.qualificationTask.service.impl;

import com.jakubkolacz.qualificationTask.domain.dao.Book;
import com.jakubkolacz.qualificationTask.repository.BookRepository;
import com.jakubkolacz.qualificationTask.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Page<Book> getPage(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
}
