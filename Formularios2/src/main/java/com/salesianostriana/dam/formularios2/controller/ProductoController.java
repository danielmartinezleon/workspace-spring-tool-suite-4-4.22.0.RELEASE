package com.salesianostriana.dam.formularios2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.formularios2.model.Producto;
import com.salesianostriana.dam.formularios2.service.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@GetMapping("/producto")
	public String showFormProducto(Model model) {
		Producto producto = new Producto();
		model.addAttribute("productoForm", producto);
		model.addAttribute("tipos", service.getTipos());
		
		return "formProducto";
	}
	
	@PostMapping("/addProducto")
	public String submit(@ModelAttribute("productoForm") Producto producto, Model model) {
		model.addAttribute("producto", producto);
		return "view";
	}
}
