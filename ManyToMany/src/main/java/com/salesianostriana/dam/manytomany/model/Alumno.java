package com.salesianostriana.dam.manytomany.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre, apellidos, email;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_alumno_curso"))	
	private Curso curso;
	
	
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "matricula",
			joinColumns = @JoinColumn(name="alumno_id"),
			inverseJoinColumns = @JoinColumn(name="asignatura_id")
	)
	@Builder.Default
	private List<Asignatura> asignaturas = new ArrayList<>();
	
	public Alumno(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.asignaturas = new ArrayList<>();
	}
	
	
	/*
	 * MÉTODOS HELPER PARA LA ASOCIACIÓN CON CURSO
	 */
	
	// Alumno - Curso
	
	public void addToCurso(Curso curso) {
		this.curso = curso;
		curso.getAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso curso) {
		curso.getAlumnos().remove(this);
		this.curso = null;		
	}
	
	// Alumno - Asignaturas
	public void addAsignatura(Asignatura a) {
		this.asignaturas.add(a);
		a.getAlumnos().add(this);
	}
	
	public void removeAsignatura(Asignatura a) {
		a.getAlumnos().remove(this);
		this.asignaturas.remove(a);
	}

	

}
