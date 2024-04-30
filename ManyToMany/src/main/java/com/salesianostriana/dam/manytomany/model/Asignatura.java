package com.salesianostriana.dam.manytomany.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Asignatura {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre, profesor;
	
	@ManyToOne
	private Curso curso;
	
	@ManyToMany(mappedBy="asignaturas", fetch = FetchType.EAGER)
	@Builder.Default
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private List<Alumno> alumnos = new ArrayList<>();
	
	public Asignatura(String nombre, String profesor) {
		this.nombre = nombre;
		this.profesor = profesor;
		this.alumnos = new ArrayList<>();
	}
	
	/**
	 * MÉTODOS HELPER
	 */
	
	public void addToCurso(Curso c) {
		c.getAsignaturas().add(this);
		this.curso = c;
		
	}
	
	public void removeFromCurso(Curso c) {
		c.getAsignaturas().remove(this);
		this.curso = null;
	}

}
