package com.sinensia.biblio.backend.business.services;

import java.util.List;

import com.sinensia.biblio.backend.business.model.Libro;
import com.sinensia.biblio.backend.integration.model.PrestamosPL;

public interface LibroServices {

	public List<Libro> getAll();

	public Libro create(Libro libro);

	public Libro getById(String isbn);
	
	public List<PrestamosPL> getPrestamosById(String isbn);

}
