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
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_app;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "kg")
    private Integer kg;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "status")
    private String status;
    @Column(name = "name_client")
    private String name_client;
    @Column(name = "distance")
    private String distance;
    @Column(name = "delivery_cost")
    private String delivery_cost;
    @Column(name = "obrabotka")
    private Boolean obrabotka;
    @Column(name = "id_sale")
    private String id_sale;
    @ManyToOne
    @JoinColumn(name = "employee_id_employee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "client_id_client")
    private Client client;
}

