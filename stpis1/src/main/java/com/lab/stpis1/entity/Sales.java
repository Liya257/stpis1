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
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sales")
    private Long id_sales;
    @Column(name = "status")
    private String status;
    @Column(name = "stage")
    private String stage;
    @Column(name = "name_sale")
    private String name_sale;
    @Column(name = "data_delivery")
    private String data_delivery;
    @Column(name = "id_doc")
    private String id_doc;
    @Column(name = "id_app")
    private String id_app;
    @Column(name = "id_marshrute")
    private String id_marshrute;
    @ManyToOne
    @JoinColumn(name = "employee_id_employee")
    private Employee employee_id_employee;

    @ManyToOne
    @JoinColumn(name = "contract_id_contract")
    private Contract contract_id_contract;

    @ManyToOne
    @JoinColumn(name = "transport_id_transport")
    private Transport transport_id_transport;

    @ManyToOne
    @JoinColumn(name = "client_id_client")
    private Client client_id_client;
}
