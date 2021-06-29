package com.sinensia.biblio.backend.dozer;

import org.dozer.DozerConverter;

public class BooleanToSiNoMapper extends DozerConverter<String, Boolean> {

	public BooleanToSiNoMapper() {
		super(String.class, Boolean.class);
	}

	@Override
	public Boolean convertTo(String source, Boolean destination) {

		if ("SI".equals(source)) {
			return Boolean.TRUE;
		}

		if ("NO".equals(source)) {
			return Boolean.FALSE;
		}

		throw new IllegalArgumentException("El parámetro source debe ser \"s\" o \"n\".");
	}

	@Override
	public String convertFrom(Boolean source, String destination) {

		if (Boolean.TRUE.equals(source)) {
			return "SI";
		}

		if (Boolean.FALSE.equals(source)) {
			return "NO";
		}

		throw new IllegalArgumentException("Valor " + source + " desconocido.");
	}

}
