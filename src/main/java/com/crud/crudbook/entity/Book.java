package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Book")
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String    tittle;
    private String    author;
    private Integer   numberPages;
    private String    language;
    private LocalDate datePublished;
}
