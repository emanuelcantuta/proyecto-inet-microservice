package com.inet.service;

import java.util.List;

import com.inet.entity.Escuela;

public interface EscuelaService {
	public List<Escuela> listarEscuelas() throws Exception;
	public Escuela buscarEscuelaPorId(int id) throws Exception;
}
