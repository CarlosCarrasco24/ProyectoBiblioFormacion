package com.sinensia.biblio.backend.integration.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sinensia.biblio.backend.integration.model.LibroPL;

@DataJpaTest
public class LibroPLRepositoryTest {

	@Autowired
	private LibroPLRepository libroPLRepository;

	@Test
	public void should_store_a_libro() {
		LibroPL libroPL = new LibroPL();
		libroPL.setISBN("555555-AR");
		libroPL.setAutor("Carlos Carrasco");
		libroPL.setNumeroPaginas(219);
		LibroPL createdLibroPL = libroPLRepository.save(libroPL);
		assertEquals("Carlos Carrasco", createdLibroPL.getAutor());
		assertNotEquals(0, createdLibroPL.getNumeroPaginas());
	}

	@Test
	public void should_retrieve_a_libro_by_isbn() {

		Optional<LibroPL> optional = libroPLRepository.findById("111111-AR");
		assertTrue(optional.isPresent());
		LibroPL libroPL = optional.get();
		assertEquals("Los bugs", libroPL.getTitulo());
		assertEquals(43.99, libroPL.getPrecio());
	}

	@Test
	public void should_retrieve_all_libros() {
		List<LibroPL> libros = libroPLRepository.findAll();
		assertEquals(4, libros.size());
	}

	@Test
	public void should_retrieve_all_prestamos_by_isbn() {
		Optional<LibroPL> optional = libroPLRepository.findById("111111-AR");
		assertTrue(optional.isPresent());
		LibroPL libroPL = optional.get();
		assertEquals(2, libroPL.getPrestamos().size());
	}
}
