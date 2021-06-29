package com.sinensia.biblio.backend.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LIBROS")
public class LibroPL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String ISBN;

	private String titulo;
	private String autor;

	@Temporal(TemporalType.DATE)
	private Date fechaPublicacion;

	@Enumerated(EnumType.STRING)
	private GeneroPL genero;

	private int numeroPaginas;
	private boolean disponible;
	private double precio;

	@ElementCollection
	@OrderColumn(name = "INDICE")
	@CollectionTable(name = "PRESTAMOS", joinColumns = @JoinColumn(name = "ISBN_LIBRO"))
	private List<PrestamosPL> prestamos;

	public LibroPL() {

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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroPL other = (LibroPL) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LibroPL [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion="
				+ fechaPublicacion + ", genero=" + genero + ", numeroPaginas=" + numeroPaginas + ", disponible="
				+ disponible + ", precio=" + precio + ", prestamos=" + prestamos + "]";
	}

}
