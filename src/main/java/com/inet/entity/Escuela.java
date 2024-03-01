package com.inet.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.inet.dto.EscuelaDto;

@Entity
@Table(name = "escuelas")
public class Escuela {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cue")
	private int cue;
	
	@Column(name = "tipo_oferta")
	private String tipoOferta;

	@Column(name = "id_especialidad")
	private int idEspecialidad;
	
	@Column(name = "matricula")
	private int matricula;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "cp")
	private int cp;
	
	@Column(name = "departamento")
	private String departamento;
	
	@Column(name = "jurisdiccion")
	private String jurisdiccion;
	
	@Column(name = "localidad")
	private String localidad;
	  
	@Column(name = "paraje")
	private String paraje;
	
	@Column(name = "es_aula_taller")
	private String aulaTaller;
	  
	@Column(name = "gestion")
	private String gestion;
	
	@Column(name = "dependencia")
	private String dependencia;
	
	@Column(name = "modalidad")
	private String modalidad;
	
	@Column(name = "clase")
	private String clase;
	
	@Column(name = "mail_institucional")
	private String mailInstitucional;
	
	@Column(name = "web_institucional")
	private String webInstitucional;
	
	@Column(name = "telefono")
	private int telefono;
	 
	@Column(name = "centro_estudiante")
	private String centroEstudiante;
	
	@Column(name = "a_actualizacion")
	private String aActualizacion;
	
	public Escuela(){
		
	}

	public Escuela(int id, int cue, String tipoOferta, int idEspecialidad, int matricula, String nombre,
			String direccion, int cp, String departamento, String jurisdiccion, String localidad, String paraje,
			String aulaTaller, String gestion, String dependencia, String modalidad, String clase,
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
	
	public EscuelaDto toDto() {
		return new EscuelaDto(getId(), getCue(), getTipoOferta(), getIdEspecialidad(), getMatricula(), getNombre(), getDireccion(), getCp(), getDepartamento(), getJurisdiccion(), getLocalidad(), getParaje(), getAulaTaller(), getGestion(), getDependencia(), getModalidad(), getClase(), getMailInstitucional(), getWebInstitucional(), getTelefono(), getCentroEstudiante(), getaActualizacion()); 
	}

	@Override
	public String toString() {
		return "Escuela [id=" + id + ", cue=" + cue + ", tipoOferta=" + tipoOferta + ", idEspecialidad="
				+ idEspecialidad + ", matricula=" + matricula + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", cp=" + cp + ", departamento=" + departamento + ", jurisdiccion=" + jurisdiccion + ", localidad="
				+ localidad + ", paraje=" + paraje + ", aulaTaller=" + aulaTaller + ", gestion=" + gestion
				+ ", dependencia=" + dependencia + ", modalidad=" + modalidad + ", clase=" + clase
				+ ", mailInstitucional=" + mailInstitucional + ", webInstitucional=" + webInstitucional + ", telefono="
				+ telefono + ", centroEstudiante=" + centroEstudiante + ", aActualizacion=" + aActualizacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aActualizacion, aulaTaller, centroEstudiante, clase, cp, cue, departamento, dependencia,
				direccion, gestion, id, idEspecialidad, jurisdiccion, localidad, mailInstitucional, matricula,
				modalidad, nombre, paraje, telefono, tipoOferta, webInstitucional);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escuela other = (Escuela) obj;
		return Objects.equals(aActualizacion, other.aActualizacion) && Objects.equals(aulaTaller, other.aulaTaller)
				&& Objects.equals(centroEstudiante, other.centroEstudiante) && Objects.equals(clase, other.clase)
				&& cp == other.cp && cue == other.cue && Objects.equals(departamento, other.departamento)
				&& Objects.equals(dependencia, other.dependencia) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(gestion, other.gestion) && id == other.id && idEspecialidad == other.idEspecialidad
				&& Objects.equals(jurisdiccion, other.jurisdiccion) && Objects.equals(localidad, other.localidad)
				&& Objects.equals(mailInstitucional, other.mailInstitucional) && matricula == other.matricula
				&& Objects.equals(modalidad, other.modalidad) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(paraje, other.paraje) && telefono == other.telefono
				&& Objects.equals(tipoOferta, other.tipoOferta)
				&& Objects.equals(webInstitucional, other.webInstitucional);
	}
}
