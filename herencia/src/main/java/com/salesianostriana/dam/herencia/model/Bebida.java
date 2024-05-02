package com.salesianostriana.dam.herencia.model;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class Bebida extends Producto{

	private int tamanio;

	public Bebida(String nombre, float precio, int tamanio) {
		super(nombre, precio);
		this.tamanio = tamanio;
	}	
}