package com.salesianostriana.dam.formularios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.formularios.model.Empleado;

@Controller
public class EmpleadoController {

	@GetMapping("/empleado")
	public String showForm(Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
	}
	
	
	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado, Model model) {
		
		model.addAttribute("empleado", empleado);
		
		return "view";
	}
}
