package com.salesianostriana.dam.ejemplospringcore3jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplospringcore3jpa.model.Alumno;
import com.salesianostriana.dam.ejemplospringcore3jpa.model.Curso;
import com.salesianostriana.dam.ejemplospringcore3jpa.repository.AlumnoRepository;
import com.salesianostriana.dam.ejemplospringcore3jpa.repository.CursoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	@Autowired
	private AlumnoRepository repositorio;
	
	@Autowired
	private CursoRepository cursoRepo;
	
	@PostConstruct
	void ejecutar() {
		//Curso c = new Curso("1Dam", "Miguel");
		Curso c = Curso.builder()
				.nombre("1º DAM")
				.tutor("Miguel Campos")
				.build();
		
		cursoRepo.save(c);
		
		/*Alumno a = new Alumno("Daniel", "Martínez León", "aaa@aaa.es");
		Alumno b = new Alumno("Luismi", "López Magaña", "eee@eee.es");
		repositorio.save(a);
		repositorio.save(b);
		
		a.addToCurso(c);
		
		*/
		
		Alumno a = Alumno.builder()
				.nombre("Daniel")
				.apellidos("Martinez")
				.email("aaa@gmail.com")
				.build();
		
		a.addToCurso(c);
		
		repositorio.save(a);
		
		//repositorio.findAll().forEach(a -> System.out.println(a));
		repositorio.findAll().forEach(System.out::println);
	}
}
