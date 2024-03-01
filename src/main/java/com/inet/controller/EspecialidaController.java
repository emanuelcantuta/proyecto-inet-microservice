package com.inet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inet.dto.EspecialidadDto;
import com.inet.exception.ErrorException;
import com.inet.service.EspecialidadService;

@RestController
public class EspecialidaController {
	@Autowired
	private EspecialidadService especialidadService;

	public EspecialidaController(EspecialidadService especialidadService) {
		super();
		this.especialidadService = especialidadService;
	}
	
	@GetMapping(value = "/especialidades", produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_PROBLEM_JSON_VALUE})
	public ResponseEntity<List<EspecialidadDto>> listarEspecialidades() throws Exception, ErrorException{
		
		List<EspecialidadDto> especialidades = new ArrayList<>();
			
			especialidadService.listarEspecialidades().forEach(x->{
				especialidades.add(x.toDto());
			});
		
		return new ResponseEntity<>(especialidades , HttpStatus.OK);
	}

	@GetMapping(value = "/infoEspecialidad/{id}", produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_PROBLEM_JSON_VALUE})
	public ResponseEntity<EspecialidadDto> infoEspecialidad(@PathVariable int id) throws Exception, ErrorException{

		return new ResponseEntity<>(especialidadService.buscarEspecialidadPorId(id).toDto(), HttpStatus.OK);
	}
	
}
