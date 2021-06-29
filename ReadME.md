# Biblio

Biblio es un proyecto creado para controlar tanto las prestaciones de libros como llevar un registro de usuarios que solicitan el prestamos y sus fechas de entrega y devolución, también se aporta información sobre los propios libros como su autor, genero, titulo etc.

## Estructura.

El proyecto está basado en 2 capas:

1) **Capa Integration**: Es la capa en la que residen los datos, esta dividida de la siguiente forma:
>> 1.1)**Model**: Encargado de relacionar los atributos del objeto con las características de un dato.

>> 1.2)**Repository**: Implementa la interfaz *JPARepository* que nos permite hacer operaciones con los datos.
2) **Capa Business**:  Se reciben las peticiones del usuario y se envían las respuestas tras el proceso con los datos extraídos desde la capa de Intregation.

>> 2.1)**Model**: Puede variar respecto al de Integration puesto que podemos obviar algunos datos o modificarlos para una mejor presentación.

>> 2.2)**Services**: Interfaz dónde residen todos los métodos con los que vamos a realizar operaciones con los datos de la capa de Integration.

>> 2.2)**ServicesImpl**: Clase donde reside toda la lógica de la capa de business.

## Otros paquetes.

- **AOP**: Encargado de ejecutar logs cada vez que se ejecute cualquier método de la capa de business, en concreto de la implementación de services.

- **Config**: En este paquete se encuentra **Dozer** que sirve para convertir los objetos desde Integration a Business y **Swagger**, herramientas de software de código abierto para diseñar, construir, documentar, y utilizar servicios web RESTful.

- **Controller**: Paquete que asociara una url con un archivo jsp que se encargará de mostrar en pantalla los datos.

## URLS Interesantes.

<a href="http://localhost:8080/swagger-ui.html
" target="_blank">API REST Reference </a>

<a href="http://localhost:8080/biblio/home
" target="_blank">Página principal de la aplicacion </a>

<a href="http://localhost:8080/h2-console
" target="_blank">Alojamiento de los datos. </a>

## Final
Prototipo final realizado por Carlos Carrasco Ureña como finalización de su formación al entrar a ViewNext.