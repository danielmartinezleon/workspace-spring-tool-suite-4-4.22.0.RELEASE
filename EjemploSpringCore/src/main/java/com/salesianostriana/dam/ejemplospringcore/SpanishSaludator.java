package com.salesianostriana.dam.ejemplospringcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola");
		
	}
	
	@PostConstruct
	void alComenzar() {
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	void alAcabar() {
		System.out.println("@PreDestroy");
	}

}
