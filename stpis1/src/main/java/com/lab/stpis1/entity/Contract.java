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
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contract;
    @Column(name = "description")
    private String description;
    @Column(name = "contract")
    private String contract;
    @Column(name = "id_cloud_doc")
    private Integer id_cloud_doc;
}