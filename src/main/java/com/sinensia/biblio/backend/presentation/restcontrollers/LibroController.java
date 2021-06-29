package com.sinensia.biblio.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.biblio.backend.business.model.Libro;
import com.sinensia.biblio.backend.business.services.LibroServices;
import com.sinensia.biblio.backend.integration.model.PrestamosPL;

@RestController
@RequestMapping("/biblio/api/v1")
@CrossOrigin
public class LibroController {

	@Autowired
	private LibroServices libroServices;

	@GetMapping("/libros")
	public List<Libro> getAll() {

		return libroServices.getAll();
	}

	@GetMapping("/libros/{isbn}")
	public Libro getByISBN(@PathVariable String isbn) {
		return libroServices.getById(isbn);
	}

	@PostMapping("/libros")
	public Libro create(@RequestBody Libro libro) {
		return libroServices.create(libro);
	}
	
	@GetMapping("/libros/{isbn}/prestamos")
	public List<PrestamosPL> getPrestamosByISBN(@PathVariable String isbn) {
		return libroServices.getPrestamosById(isbn);
	}
}
