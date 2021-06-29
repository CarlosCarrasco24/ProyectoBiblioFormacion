
INSERT INTO LIBROS (ISBN,TITULO,AUTOR,FECHA_PUBLICACION,GENERO,NUMERO_PAGINAS,DISPONIBLE,PRECIO) VALUES
('111111-AR','Los bugs','Carlos Rodriguez Sosa','2019-10-21','TERROR',234,true,43.99),
('222222-AR','El mundo de las nubes','Isabel Jota Matalauva','2020-11-16','CIENCIA_FICCION',435,false,25.75),
('333333-AR','¿Fui yo?','Martin Luther Escobar','2015-04-08','SUSPENSE',278,true,14.99),
('444444-AR','Los pulmones negros','Aitana Zapatero Montero','2021-06-12','NEGRO',346,true,41.75);

INSERT INTO PRESTAMOS (INDICE,ISBN_LIBRO,FECHA_ENTREGA,FECHA_DEVOLUCION,USUARIO,NUMERO_CARNET,OBSERVACIONES) VALUES 
(0,'111111-AR','2019-11-15 19:20:12','2019-12-15 11:34:45','Marcos Rubi',7652345,'Devuelto en perfecto estado'),
(1,'111111-AR','2020-01-03 10:45:47','2020-01-26 18:06:32','Melania Trump',4563215,'Viene con una mancha de ketchup'),
(0,'222222-AR','2020-12-15 11:23:18','2020-12-23 17:24:56','Nicky Llanos',6567893,'Mordido por el perro'),
(0,'333333-AR','2016-08-23 11:56:43','2018-12-07 10:37:21','Ander Ramos',8763342,'Devuelto en perfecto estado'),
(0,'444444-AR','2021-06-13 09:20:46','2021-06-20 13:35:59','Juan Balenciaza',6542190,'Devuelto con hojas arrancadas');
