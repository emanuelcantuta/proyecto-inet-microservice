package com.inet.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.inet.dto.EspecialidadDto;

@Entity
@Table(name = "especialidades")
public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_e")
	private int id;
	
	@Column(name = "sector")
	private String sector; 
	
	@Column(name = "titulo")
	private String titulo;
	
	public Especialidad( ) {
		
	}

	public Especialidad(int id, String sector, String titulo) {
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
	
	public EspecialidadDto toDto() {
		return new EspecialidadDto(getId(), getSector(), getTitulo());
	}

	@Override
	public String toString() {
		return "Especialidad [id=" + id + ", sector=" + sector + ", titulo=" + titulo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sector, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidad other = (Especialidad) obj;
		return id == other.id && Objects.equals(sector, other.sector) && Objects.equals(titulo, other.titulo);
	}
	
}
