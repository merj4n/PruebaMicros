package com.carbridge.carbridge.vo;

import java.util.Date;


import lombok.Value;

@Value
public class PrecioVO {

    private Long id;
    private float precio;
    private Date fechaInicio;
    private Date fechaFin;
    private Long cocheId;
    private Long marcaId;
    
    
	
}
