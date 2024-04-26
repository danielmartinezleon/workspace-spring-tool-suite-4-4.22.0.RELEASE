package com.salesianostriana.dam.ejemplospringcore3jpa.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Curso {

	@Id @GeneratedValue
	private long id;
	
	private String nombre;
	private String tutor;
	
	//Nombre del mappedBy = nombre atributo ManyToOne
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	private List<Alumno> alumnos = new ArrayList<>();
	
	
	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
	}
	
	
	
	
}