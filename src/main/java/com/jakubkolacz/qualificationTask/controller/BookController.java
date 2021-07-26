package com.jakubkolacz.qualificationTask.controller;

import com.jakubkolacz.qualificationTask.domain.dao.Book;
import com.jakubkolacz.qualificationTask.service.BookService;
import com.jakubkolacz.qualificationTask.validatior.group.AuthorStarts;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
@Validated
public class BookController {
    private final BookService bookService;

    @PostMapping
    @Validated(AuthorStarts.class)
    public Book addBook(@RequestBody @Valid Book book) {
        return bookService.save(book);
    }

    @GetMapping
    public Page<Book> getBookPage(@RequestParam int page,@RequestParam int size){
        if(bookService.getPage(PageRequest.of(page, size)).isEmpty()){
            System.out.println("There are no books on this page, do you want to add new books?");
        }
        return bookService.getPage(PageRequest.of(page,size));
    }
}
