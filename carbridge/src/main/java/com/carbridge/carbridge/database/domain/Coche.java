package com.carbridge.carbridge.database.domain;

import lombok.Data;
import javax.persistence.*;

import java.util.List;


@Entity
@Data
@Table(name = "COCHES")
public class Coche {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coche_id")
    private Long id;
    
    @Column(name = "nombre_modelo")
    private String nombreModelo;
    
    private String color;      

    @OneToOne(mappedBy = "coches", cascade=CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Marca marca;

}
