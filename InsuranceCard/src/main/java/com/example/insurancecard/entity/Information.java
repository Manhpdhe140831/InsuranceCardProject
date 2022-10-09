package com.example.insurancecard.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "tbl_Profile")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String folk;
    private int gender;
    private String brithDate;
    private String address;
    private String phone;

}
