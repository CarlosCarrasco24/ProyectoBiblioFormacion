package com.sinensia.biblio.backend.business.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.biblio.backend.business.model.Libro;
import com.sinensia.biblio.backend.business.services.LibroServices;
import com.sinensia.biblio.backend.integration.model.LibroPL;
import com.sinensia.biblio.backend.integration.model.PrestamosPL;
import com.sinensia.biblio.backend.integration.repositories.LibroPLRepository;

@Service
public class LibroServicesImpl implements LibroServices {

	@Autowired
	private LibroPLRepository libroPLRepository;

	@Autowired
	private DozerBeanMapper mapper;

	@Override
	public List<Libro> getAll() {

		return libroPLRepository.findAll().stream().map(x -> mapper.map(x, Libro.class)).collect(Collectors.toList());
	}

	@Override
	public Libro create(Libro libro) {
		final LibroPL libroPL = mapper.map(libro, LibroPL.class);
		final LibroPL createdLibroPL = libroPLRepository.save(libroPL);
		return mapper.map(createdLibroPL, Libro.class);
	}

	@Override
	public Libro getById(String isbn) {
		Optional<LibroPL> optional = libroPLRepository.findById(isbn);
		return optional.isPresent() ? mapper.map(optional.get(), Libro.class) : null;
	}

	@Override
	public List<PrestamosPL> getPrestamosById(String isbn) {
		Libro libro;
		Optional<LibroPL> optional = libroPLRepository.findById(isbn);
		if(optional.isPresent()) {
			libro = mapper.map(optional.get(), Libro.class);
			return libro.getPrestamos();
		}
		
		return null;
	}


}
