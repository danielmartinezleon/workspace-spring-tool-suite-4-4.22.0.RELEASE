package com.salesianostriana.dam.ejemplospringcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class FalsoMain {

	@Autowired
	private Saludator saludator;
	
	@PostConstruct
	public void init() {
		
		saludator.imprimirSaludo();
	
	}
}
