package com.jakubkolacz.qualificationTask.domain.dao;

import com.jakubkolacz.qualificationTask.validatior.AuthorValid;
import com.jakubkolacz.qualificationTask.validatior.group.AuthorStarts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@AuthorValid(groups = AuthorStarts.class)
public class Book {
    private String title;
    @Valid
    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;
    @Id
    @Column(unique = true)
    private String isbn;
}
