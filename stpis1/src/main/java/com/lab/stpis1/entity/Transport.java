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
@Entity(name = "transport")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_transport;

    @Column(name = "breaks")
    private Boolean breaks;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "color")
    private String color;
    @Column(name = "fuel")
    private String fuel;
    @Column(name = "fuel_consumption")
    private Double fuel_consumption;
    @Column(name = "model")
    private String model;
    @Column(name = "service")
    private Double servise;
    @ManyToOne
    @JoinColumn(name = "type_id_type")
    private Type type;

}
