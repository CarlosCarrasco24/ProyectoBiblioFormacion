DROP TABLE LIBROS 			IF EXISTS;
DROP TABLE PRESTAMOS 		IF EXISTS;

CREATE TABLE LIBROS( 
	ISBN					VARCHAR(30)  			NOT NULL,
	TITULO					VARCHAR(200)			,
	AUTOR					VARCHAR(100)			NOT NULL,
	FECHA_PUBLICACION		DATE					,
	GENERO					VARCHAR(40)				,
	NUMERO_PAGINAS			INT						,
	DISPONIBLE				BOOLEAN					NOT NULL,
	PRECIO					DOUBLE					,
	
	PRIMARY KEY (ISBN)
);

CREATE TABLE PRESTAMOS(
	INDICE					INT						NOT NULL,
	ISBN_LIBRO					VARCHAR(30)			NOT NULL,
	FECHA_ENTREGA			TIMESTAMP				,
	FECHA_DEVOLUCION		TIMESTAMP				NOT NULL,
	USUARIO					VARCHAR(200)			,
	NUMERO_CARNET			INT						,
	OBSERVACIONES			VARCHAR(300)			,	
	
	FOREIGN KEY (ISBN_LIBRO) REFERENCES LIBROS (ISBN)
);