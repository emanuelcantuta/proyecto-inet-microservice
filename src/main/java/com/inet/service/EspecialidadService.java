package com.inet.service;

import java.util.List;

import com.inet.entity.Especialidad;

public interface EspecialidadService {
	public List<Especialidad> listarEspecialidades() throws Exception;
	public Especialidad buscarEspecialidadPorId(int id) throws Exception;
}
