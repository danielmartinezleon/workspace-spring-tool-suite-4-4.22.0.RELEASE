package com.salesianostriana.dam.ejemplo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Cliente {
	
	private long id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String genero;

}
