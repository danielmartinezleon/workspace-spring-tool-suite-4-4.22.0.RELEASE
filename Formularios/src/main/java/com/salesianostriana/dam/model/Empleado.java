package com.salesianostriana.dam.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Empleado {

	private Long id;
	private String nombre;
	private String email;
}
