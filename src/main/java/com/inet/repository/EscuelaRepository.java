package com.inet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inet.entity.Escuela;

@Repository
public interface EscuelaRepository extends CrudRepository<Escuela, Integer>{

	
	/*
	@Query(value = "SELECT * FROM escuelas INNER JOIN especialidades ON escuelas.id_especialidad = especialidades.id_e")
	List<Escuela> fetchStudentDataJoinTable();
	*/	 
}
