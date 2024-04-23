package com.salesianostriana.dam.ejemplo02;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
	
	private long id;
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean stock = false;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime fecha;
}
