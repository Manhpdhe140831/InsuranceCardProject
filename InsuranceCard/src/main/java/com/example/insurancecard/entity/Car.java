package com.example.insurancecard.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private String license;
    private String type;
    private String color;
    private String MFG;


}
