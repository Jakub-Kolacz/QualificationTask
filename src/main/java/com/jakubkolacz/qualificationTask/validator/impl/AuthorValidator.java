package com.jakubkolacz.qualificationTask.validator.impl;


import com.jakubkolacz.qualificationTask.domain.dao.Book;
import com.jakubkolacz.qualificationTask.validator.AuthorValid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AuthorValidator implements ConstraintValidator<AuthorValid, Book> {

    @Override
    public boolean isValid(Book book, ConstraintValidatorContext constraintValidatorContext) {
        return book.getAuthor().getFirstName().startsWith("A") || book.getAuthor().getLastName().startsWith("A");
    }
}
