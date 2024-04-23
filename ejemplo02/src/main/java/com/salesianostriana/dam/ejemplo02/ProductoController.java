package com.salesianostriana.dam.ejemplo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@GetMapping("/productos")
	public String controladorCondicionales(Model model) {
		model.addAttribute("productList", service.getLista());
		return "PlantillaBucleYFormateo";
	}
}
