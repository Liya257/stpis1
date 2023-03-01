package com.lab.stpis1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;
    @Column(name = "surname_c")
    private String surname_c;
    @Column(name = "name_c")
    private String name_c;
    @Column(name="telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "post")
    private String post;
    @ManyToOne
    @JoinColumn(name = "company_id_company")
    private Company company;

}