package com.lab.stpis1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_company;
    @Column(name = "name_company")
    private String name_company;
    @Column(name = "address_company")
    private String address_company;
    @Column(name = "bik")
    private String bik;
    @Column(name = "rekvezity")
    private String rekvezity;
    @Column(name ="fio_director")
    private String fio_director;
}