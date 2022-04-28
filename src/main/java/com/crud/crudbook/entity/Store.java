package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;


@Entity(name = "Store")
@Table(name = "store")
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;
    private String phoneNumber;
    private Long   zipCode;
    private String city;
    private String country;
}
