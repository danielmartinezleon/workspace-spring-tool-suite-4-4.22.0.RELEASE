package com.salesianostriana.dam.ejemplospringcore3jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Alumno {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String nombre, apellidos, email;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_alumno_curso"))
	private Curso curso;
	
	public Alumno(String n, String a, String e) {
		this.nombre = n;
		this.apellidos = a;
		this.email = e;
	}

	/*public Alumno(String nombre, String apellidos, String email, Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.curso = curso;
	}*/
	
	public void addToCurso(Curso curso) {
		this.curso = curso;
		curso.getAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso curso) {
		curso.getAlumnos().remove(this);
		this.curso = null;		
	}


}