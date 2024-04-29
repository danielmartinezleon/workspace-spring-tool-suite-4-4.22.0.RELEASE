package com.salesianostriana.dam.serviciobase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.serviciobase.model.Alumno;

public interface AlumnoRepository 
	extends JpaRepository<Alumno, Long> {

}