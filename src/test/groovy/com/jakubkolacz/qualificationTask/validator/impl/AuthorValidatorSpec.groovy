package com.jakubkolacz.qualificationTask.validator.impl

import com.jakubkolacz.qualificationTask.domain.dao.Author
import com.jakubkolacz.qualificationTask.domain.dao.Book
import spock.lang.Specification

class AuthorValidatorSpec extends Specification {

    def authorValidator = new AuthorValidator();

    def 'should test author validator'() {
        given:
        def book = new Book("title", new Author(firstName: firstName, lastName: lastName), "isbn")

        when:
        def result = authorValidator.isValid(book, null)

        then:
        result == expected

        where:
        firstName | lastName    || expected
        'Aname'   | 'lastName'  || true
        'name'    | 'AlastName' || true
        'name'    | 'lastName'  || false


    }
}
