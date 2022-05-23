package com.carbridge.carbridge.mapper;

import com.carbridge.carbridge.database.domain.Coche;
import com.carbridge.carbridge.vo.CocheVO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CocheMapper{

//	@Mapping(source = "marca.nombreMarca", target = "marcaVO.nombreMarca")
//	@Mapping(source = "id", target = "id")
	CocheVO cocheToCocheVO(Coche coche);
	Coche cocheVOToCoche(CocheVO cocheVO);

}