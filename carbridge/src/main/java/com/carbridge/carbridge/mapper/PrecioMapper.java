package com.carbridge.carbridge.mapper;


import com.carbridge.carbridge.database.domain.Precio;
import com.carbridge.carbridge.vo.PrecioVO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrecioMapper {

//	@Mapping(source = "coche.id", target = "cocheId")
//	@Mapping(source = "marca.id", target = "marcaId")
	PrecioVO precioToPrecioVO(Precio precio);
	
	Precio precioVOToPrecio(PrecioVO precioVO);
	
}
