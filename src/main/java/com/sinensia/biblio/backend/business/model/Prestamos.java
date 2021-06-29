package com.sinensia.biblio.backend.business.model;

import java.io.Serializable;
import java.util.Date;

public class Prestamos implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date fechaEntrega;
	private Date fechaDevolucion;
	private String usuario;
	private int numeroCarnet;
	private String observaciones;

	public Prestamos() {
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNumeroCarnet() {
		return numeroCarnet;
	}

	public void setNumeroCarnet(int numeroCarnet) {
		this.numeroCarnet = numeroCarnet;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Prestamos [fechaEntrega=" + fechaEntrega + ", fechaDevolucion=" + fechaDevolucion + ", usuario="
				+ usuario + ", numeroCarnet=" + numeroCarnet + ", observaciones=" + observaciones + "]";
	}

}
