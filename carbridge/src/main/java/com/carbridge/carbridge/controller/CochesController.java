package com.carbridge.carbridge.controller;

import java.util.List;

import com.carbridge.carbridge.database.domain.Coche;
import com.carbridge.carbridge.database.domain.Marca;
import com.carbridge.carbridge.database.repository.CochesRepository;
import com.carbridge.carbridge.database.repository.MarcasRepository;
import com.carbridge.carbridge.mapper.CocheMapper;
import com.carbridge.carbridge.service.CochesService;
import com.carbridge.carbridge.vo.CocheVO;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping(value = "/")
public class CochesController {

	@Autowired
	private CochesRepository cochesRepository;
	
	@Autowired
	private CocheMapper cocheMapper;
	
	@Autowired
	private MarcasRepository marcasRepository;
	
	@Autowired
	private CochesService cochesService;

//	@PostMapping("/test")
//	public CocheVO saveAndReturn(@RequestBody CocheVO cocheVO) {
//		
//		
//		log.info("Primer logger {}",cocheVO);
//		
//		Coche coche = cocheMapper.cocheVOToCoche(cocheVO);
//		Marca marca = marcasRepository.save(coche.getMarca());
//		log.info("Segundo logger {}",coche);
//		coche = cochesRepository.save(coche);
//		return cocheMapper.cocheToCocheVO(coche);
//	
//	}
	
	@PostMapping("/test2")
	public List<CocheVO> returnCars() {
		
		List<CocheVO> lista = cochesService.listarCoches();
		
		return lista;
	
	}
	
	
	
/*	@GetMapping(value = "/listadocoches")
	public ResponseEntity<List<Coche>> listarIdyMarca(@RequestParam Long id,
			@Param(value = "fecha_aplicacion") String fecha_aplicacion) {

		if (fecha_aplicacion.isBlank()) {
			return ResponseEntity.badRequest().build();
		}

		try {

			if (id == 0) {
				List<Coche> coches = cochesService.listarCoches();
				return ResponseEntity.ok(coches);
			} else {
				List<Coche> coches = cochesService.getCocheWithBrand(id, fecha_aplicacion);
				if (coches == null) {
					return ResponseEntity.noContent().build();
				}
				return ResponseEntity.ok(coches);
			}
		} catch (Exception e) {

			return ResponseEntity.badRequest().build();

		}

	}

	@GetMapping(value = "/coches")
	public ResponseEntity<List<Coche>> listarCoches(@RequestParam(value = "filter") String filter) {

		if (filter.isBlank()) {
			return ResponseEntity.badRequest().build();
		} else {
			List<Coche> coches = cochesService.getConstructedClause(filter);
			return ResponseEntity.ok(coches);
		}
	}
	*/
//
//	@GetMapping(value = "/coches/excel")
//	public ResponseEntity<StreamingResponseBody> excel() throws IOException {
//		
//		int fila = 1;
//		List<Coche> coches = cochesService.listarCoches();
//					
//		Workbook workBook = new XSSFWorkbook(); 
//		Sheet sheet = workBook.createSheet("ListadoCoches");
//		sheet.setColumnWidth(0, 2560);
//		sheet.setColumnWidth(1, 2560);
//		sheet.setColumnWidth(2, 2560);
//		
//		CellStyle headerStyle = workBook.createCellStyle();
//				
//		Cell cell = sheet.createRow(0).createCell(0);
//		cell.setCellStyle(headerStyle);
//
//		/*cell.setCellValue("cochesentity_id");
//		cell = sheet.createRow(0).createCell(1);		
//		cell.setCellValue("nombre_modelo");
//		cell = sheet.createRow(0).createCell(2);
//		cell.setCellValue("color");				
//		
//		for (Coche coche : coches) {
//			Row row = sheet.createRow(fila);
//			row.createCell(0).setCellValue(coche.getId());
//			row.createCell(1).setCellValue(coche.getNombre_modelo());
//			row.createCell(2).setCellValue(coche.getColor());
//			fila++;
//		}
//*/
//		return ResponseEntity.ok().contentType(MediaType.APPLICATION_OCTET_STREAM)
//				.header(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=\"reporte.xlsx\"")
//				.body(workBook::write);
//	}
   
}
