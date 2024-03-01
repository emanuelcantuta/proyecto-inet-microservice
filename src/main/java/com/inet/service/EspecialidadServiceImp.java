package com.inet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inet.entity.Especialidad;
import com.inet.repository.EspecialidadRepository;

@Service
public class EspecialidadServiceImp implements EspecialidadService{

	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public EspecialidadServiceImp(EspecialidadRepository especialidadRepository) {
		super();
		this.especialidadRepository = especialidadRepository;
	}

	@Override
	public List<Especialidad> listarEspecialidades() throws Exception {
		List<Especialidad> especialidades = new ArrayList<>();
		
		especialidadRepository.findAll().forEach(x->{
			especialidades.add(x);
		});
		
		return especialidades;
	}

	@Override
	public Especialidad buscarEspecialidadPorId(int id) throws Exception {
		
		Optional<Especialidad> especialidad = especialidadRepository.findById(id);
		
		if(especialidad.isEmpty()) {
			throw new Exception("No se pudo encontrar la especialidad con el id: " + id);
		}
		
		return especialidad.get();
	}

}
