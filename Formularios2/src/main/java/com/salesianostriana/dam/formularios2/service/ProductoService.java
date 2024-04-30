package com.salesianostriana.dam.formularios2.service;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {

	public String[] getTipos() {
		String [] tipos = new String[] {"Lager", "Pilsen", "Guinness", "Sin filtrar"};
		
		return tipos;
	}
}
