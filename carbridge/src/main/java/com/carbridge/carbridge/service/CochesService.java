package com.carbridge.carbridge.service;


import java.util.ArrayList;
import java.util.List;

import com.carbridge.carbridge.database.domain.Coche;
import com.carbridge.carbridge.database.domain.Marca;
import com.carbridge.carbridge.database.repository.CochesRepository;
import com.carbridge.carbridge.database.repository.MarcasRepository;
import com.carbridge.carbridge.mapper.CocheMapper;
import com.carbridge.carbridge.vo.CocheVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CochesService {

	@Autowired
	private CochesRepository cochesRepository;
	
	@Autowired
	private CocheMapper cocheMapper;
	
   public List<CocheVO> listarCoches(){
	   	   
	   List<Coche> coches = cochesRepository.findAll();
	   List<CocheVO> listaCochesVO = new ArrayList<>();
	   
	   for (Coche coche : coches) {
		   CocheVO cocheVO = cocheMapper.cocheToCocheVO(coche);
		   listaCochesVO.add(cocheVO);				
	}
	   
	   return listaCochesVO;	   
	   
   }
//
//    public Coche getCocheById(Long id);
//    
//    public List<Coche> getCocheWithBrand(Long id, String fecha);
//    
//    public List<Coche> getConstructedClause(String filter);

}
