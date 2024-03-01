package com.inet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inet.entity.Especialidad;

@Repository
public interface EspecialidadRepository extends CrudRepository<Especialidad, Integer>{

}
