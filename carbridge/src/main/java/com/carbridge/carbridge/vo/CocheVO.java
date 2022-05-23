package com.carbridge.carbridge.vo;


import java.util.List;


import lombok.Value;

@Value
public class CocheVO {

	
    private Long id;
	
    private String nombreModelo;
	
    private String color;
	
    private MarcaVO marcaVO; 
	
}
