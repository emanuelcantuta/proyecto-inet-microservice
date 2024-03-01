package com.inet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inet.entity.Escuela;
import com.inet.repository.EscuelaRepository;

@Service
public class EscuelaServiceImp implements EscuelaService{

	@Autowired
	private EscuelaRepository escuelaRepository;
	
	public EscuelaServiceImp(EscuelaRepository escuelaRepository) {
		super();
		this.escuelaRepository = escuelaRepository;
	}

	@Override
	public List<Escuela> listarEscuelas() throws Exception {
		List<Escuela> escuelas = new ArrayList<>();
		
		escuelaRepository.findAll().forEach(x->{
			escuelas.add(x);
		});
		
		return escuelas;
	}

	@Override
	public Escuela buscarEscuelaPorId(int id) throws Exception {
		Optional<Escuela> escuela = escuelaRepository.findById(id);
		
		if(escuela.isEmpty()) {
			throw new Exception("no se pudo encontrar la escuela con el id: " + id);
		}
		
		return escuela.get();
	}



}
