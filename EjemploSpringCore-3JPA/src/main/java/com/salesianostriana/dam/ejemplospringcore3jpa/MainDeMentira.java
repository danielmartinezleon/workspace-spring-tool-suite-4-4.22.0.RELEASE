package com.salesianostriana.dam.ejemplospringcore3jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplospringcore3jpa.model.Alumno;
import com.salesianostriana.dam.ejemplospringcore3jpa.repository.AlumnoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepository repositorio;
	
	@PostConstruct
	void ejecutar() {
		repositorio.save(new Alumno("Daniel", "Martínez León", "aaa@aaa.es"));
		repositorio.save(new Alumno("Luismi", "López Magaña", "aaa@aaa.es"));
	}
}
