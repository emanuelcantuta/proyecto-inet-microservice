package com.inet.dto;

import com.inet.entity.Escuela;

public class EscuelaDto {
	private int id;
	private int cue;
	private String tipoOferta;
	private int idEspecialidad;
	private int matricula;
	private String nombre;
	private String direccion;
	private int cp;
	private String departamento;
	private String jurisdiccion;
	private String localidad;
	private String paraje;
	private String aulaTaller;
	private String gestion;
	private String dependencia;
	private String modalidad;
	private String clase;
	private String mailInstitucional;
	private String webInstitucional;
	private int telefono;
	private String centroEstudiante;
	private String aActualizacion;
	
	public EscuelaDto(){
		
	}
	
	public EscuelaDto(int id, int cue, String tipoOferta, int idEspecialidad, int matricula,
			String nombre, String direccion, int cp, String departamento, String jurisdiccion, String localidad,
			String paraje, String aulaTaller, String gestion, String dependencia, String modalidad, String clase,
			String mailInstitucional, String webInstitucional, int telefono, String centroEstudiante,
			String aActualizacion) {
		this.id = id;
		this.cue = cue;
		this.tipoOferta = tipoOferta;
		this.idEspecialidad = idEspecialidad;
		this.matricula = matricula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cp = cp;
		this.departamento = departamento;
		this.jurisdiccion = jurisdiccion;
		this.localidad = localidad;
		this.paraje = paraje;
		this.aulaTaller = aulaTaller;
		this.gestion = gestion;
		this.dependencia = dependencia;
		this.modalidad = modalidad;
		this.clase = clase;
		this.mailInstitucional = mailInstitucional;
		this.webInstitucional = webInstitucional;
		this.telefono = telefono;
		this.centroEstudiante = centroEstudiante;
		this.aActualizacion = aActualizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCue() {
		return cue;
	}

	public void setCue(int cue) {
		this.cue = cue;
	}

	public String getTipoOferta() {
		return tipoOferta;
	}

	public void setTipoOferta(String tipoOferta) {
		this.tipoOferta = tipoOferta;
	}
	
	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getJurisdiccion() {
		return jurisdiccion;
	}

	public void setJurisdiccion(String jurisdiccion) {
		this.jurisdiccion = jurisdiccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getParaje() {
		return paraje;
	}

	public void setParaje(String paraje) {
		this.paraje = paraje;
	}

	public String getAulaTaller() {
		return aulaTaller;
	}

	public void setAulaTaller(String aulaTaller) {
		this.aulaTaller = aulaTaller;
	}

	public String getGestion() {
		return gestion;
	}

	public void setGestion(String gestion) {
		this.gestion = gestion;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getMailInstitucional() {
		return mailInstitucional;
	}

	public void setMailInstitucional(String mailInstitucional) {
		this.mailInstitucional = mailInstitucional;
	}

	public String getWebInstitucional() {
		return webInstitucional;
	}

	public void setWebInstitucional(String webInstitucional) {
		this.webInstitucional = webInstitucional;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCentroEstudiante() {
		return centroEstudiante;
	}

	public void setCentroEstudiante(String centroEstudiante) {
		this.centroEstudiante = centroEstudiante;
	}

	public String getaActualizacion() {
		return aActualizacion;
	}

	public void setaActualizacion(String aActualizacion) {
		this.aActualizacion = aActualizacion;
	}

	public Escuela toEntity() {
		return new Escuela(getId(), getCue(), getTipoOferta(), getIdEspecialidad(), getMatricula(), getNombre(), getDireccion(), getCp(), getDepartamento(), getJurisdiccion(), getLocalidad(), getParaje(), getAulaTaller(), getGestion(), getDependencia(), getModalidad(), getClase(), getMailInstitucional(), getWebInstitucional(), getTelefono(), getCentroEstudiante(), getaActualizacion()); 
	}
	

}
