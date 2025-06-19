package br.edu.atitus.api_sample.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.api_sample.dtos.PointDTO;
import br.edu.atitus.api_sample.entities.PointEntity;
import br.edu.atitus.api_sample.services.PointService;

@RestController
@RequestMapping("/ws/point")
public class PointController {
	
	public final PointService service;

	public PointController(PointService service) {
		super();
		this.service = service;
	}	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable UUID id) throws Exception{
		service.deleteById(id);
		
		return ResponseEntity.ok("Localização excluída");
		
	}
	
	@PostMapping
	public ResponseEntity<PointEntity> save(@RequestBody PointDTO dto) throws Exception {
		PointEntity point = new PointEntity();
		BeanUtils.copyProperties(dto, point);
		
		service.save(point);
		
		return ResponseEntity.status(201).body(point);
	}

	@GetMapping
	public ResponseEntity<List<PointEntity>> findAll(){
		var lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handlerException(Exception ex) {
		String message = ex.getMessage().replaceAll("\r\n", "");
		return ResponseEntity.badRequest().body(message);
	}
	
}
