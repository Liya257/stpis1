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
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_employee;
    @Column(name = "name_em")
    private String name_em;
    @Column(name = "surname")
    private String surname;
    @Column(name = "dolgnost")
    private String dolgnost;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "stazh")
    private Integer stazh;
    @Column(name = "dofb")
    private String dofb;
    @Column(name = "data_hire")
    private String data_hire;
   /* @OneToOne
    @JoinColumn(name = "user_id_user")
    private FashUser user;*/
    @ManyToOne
    @JoinColumn(name = "company_id_company")
    private Company company;

}