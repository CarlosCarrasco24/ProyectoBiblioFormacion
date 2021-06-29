package com.sinensia.biblio.backend.integration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class PrestamosPL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEntrega;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDevolucion;
	
	private String usuario;
	private int numeroCarnet;
	private String observaciones;

	public PrestamosPL() {

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
		return "PrestamosPL [fechaEntrega=" + fechaEntrega + ", fechaDevolucion=" + fechaDevolucion + ", usuario="
				+ usuario + ", numeroCarnet=" + numeroCarnet + ", observaciones=" + observaciones + "]";
	}

}
