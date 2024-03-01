package com.inet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inet.dto.EscuelaDto;
import com.inet.exception.ErrorException;
import com.inet.service.EscuelaService;

@RestController
public class EscuelaController {
	
	@Autowired
	private EscuelaService escuelaService;
	
	public EscuelaController(EscuelaService escuelaService) {
		super();
		this.escuelaService = escuelaService;
	}
	
	@GetMapping(value = "/escuelas", produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_PROBLEM_JSON_VALUE})
	public ResponseEntity<List<EscuelaDto>> listarEscuelas() throws Exception, ErrorException{
		List<EscuelaDto> escuelas = new ArrayList<>();
		
		escuelaService.listarEscuelas().forEach(x->{
			escuelas.add(x.toDto());
		});
		
		return new ResponseEntity<>(escuelas , HttpStatus.OK);
	}

	@GetMapping(value = "/infoEscuela/{id}", produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_PROBLEM_JSON_VALUE})
	public ResponseEntity<EscuelaDto> detalleEscuela(@Validated @PathVariable int id) throws Exception, ErrorException{
		return new ResponseEntity<>(escuelaService.buscarEscuelaPorId(id).toDto(), HttpStatus.OK);
	}
	
}
