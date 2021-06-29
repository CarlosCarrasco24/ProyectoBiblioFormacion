package com.sinensia.biblio.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.biblio.backend.business.model.Libro;
import com.sinensia.biblio.backend.business.services.LibroServices;

@Controller
@RequestMapping("/biblio")
public class AppLibroController {

	@Autowired
	private LibroServices libroService;

	@GetMapping("/libros")
	public String getListado(Model model) {
		List<Libro> libros = libroService.getAll();
		model.addAttribute("libros", libros);
		return "listado_libros";
	}

}
