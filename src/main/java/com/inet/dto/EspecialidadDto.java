package com.inet.dto;

import com.inet.entity.Especialidad;

public class EspecialidadDto {
	private int id;
	private String sector; 	
	private String titulo;
	
	public EspecialidadDto() {
		
	}
	
	public EspecialidadDto(int id, String sector, String titulo) {
		this.id = id;
		this.sector = sector;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Especialidad toEntity() {		
		return new Especialidad(getId(), getSector(), getTitulo());
	}
	
}
