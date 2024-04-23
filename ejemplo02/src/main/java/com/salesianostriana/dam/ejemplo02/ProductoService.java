package com.salesianostriana.dam.ejemplo02;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {

	public List<Producto> getLista() {
		return Arrays.asList(
				new Producto(1, "Botijo", "Enfria mucho", 20.999, true, LocalDateTime.now()),
				new Producto(2, "BotijoGordo", "Enfria mucho más", 30.589, true, LocalDateTime.now())
				);
				
	}
}
