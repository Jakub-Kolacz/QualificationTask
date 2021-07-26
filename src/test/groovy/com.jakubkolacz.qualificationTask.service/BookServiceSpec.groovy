package com.jakubkolacz.qualificationTask.service

import com.jakubkolacz.qualificationTask.domain.dao.Author
import com.jakubkolacz.qualificationTask.domain.dao.Book
import com.jakubkolacz.qualificationTask.repository.BookRepository
import com.jakubkolacz.qualificationTask.service.impl.BookServiceImpl
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import spock.lang.Specification

class BookServiceSpec extends Specification {
    def bookService
    def bookRepository = Mock(BookRepository)

    def setup() {
        bookService = new BookServiceImpl(bookRepository)
    }

    def 'should save book'() {
        given:
        def book = new Book("test", new Author(1L, "AirstName", "lastName"), "isbn")

        when:
        bookService.save(book)

        then:
        1 * bookRepository.save(book)
        0 * _
    }

    def 'should not save book when invalid book is being provided'() {
        when:
        bookService.save(new Book("test", new Author(1L, "firstName", "lastName"), "fasdasdasdads123"))

        then:
        HttpStatus.BAD_REQUEST
    }

    def 'should return book page'() {
        given:
        def page = Mock(PageRequest)

        when:
        bookService.getPage(page)

        then:
        1 * bookRepository.findAll(page)
        0 * _
    }
}
