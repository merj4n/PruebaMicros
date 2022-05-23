package com.carbridge.carbridge.database.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "PRECIOS")
public class Precio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private float precio;
    
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    
    @Column(name = "fecha_fin")
    private Date fechaFin;   
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "coche_id")
//    private Coche coche;
    
//    @ManyToOne
//    private Marca marca;

 
}
