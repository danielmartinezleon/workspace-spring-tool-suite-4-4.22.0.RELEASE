package com.salesianostriana.dam.ejemplospringcore3web;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola");
		
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return "Hola";
	}

}
