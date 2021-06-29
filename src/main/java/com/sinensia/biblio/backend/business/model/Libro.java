package com.sinensia.biblio.backend.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sinensia.biblio.backend.integration.model.GeneroPL;
import com.sinensia.biblio.backend.integration.model.PrestamosPL;

public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ISBN;
	private String titulo;
	private String autor;
	private Date fechaPublicacion;
	private GeneroPL genero;
	private int numeroPaginas;
	private String disponible;
	private double precio;
	private List<PrestamosPL> prestamos;

	public Libro() {

	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public GeneroPL getGenero() {
		return genero;
	}

	public void setGenero(GeneroPL genero) {
		this.genero = genero;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<PrestamosPL> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<PrestamosPL> prestamos) {
		this.prestamos = prestamos;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + ", genero=" + genero + ", numeroPaginas=" + numeroPaginas + ", disponible="
				+ disponible + ", precio=" + precio + ", prestamos=" + prestamos + "]";
	}

}
