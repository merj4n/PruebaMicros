package com.carbridge.carbridge.database.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Table(name = "MARCAS")
public class Marca {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marca_id")
    private Long id;

	@Column(name = "nombre_marca")
    private String nombreMarca;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coche_id")
    private Coche coches;
       

}
