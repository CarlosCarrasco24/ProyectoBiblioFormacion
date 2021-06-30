<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="head_info.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<jsp:include page="cabecera.jsp"></jsp:include>
		<h2>Listado de Libros</h2>
		<table class="table table-dark table-striped">
			<tr>
				<th style="width : 12%;">ISBN</th>
				<th>T&iacute;tulo</th>
				<th>Autor</th>
				<th>Fecha de publicaci&oacute;n</th>
				<th>G&eacute;nero</th>
				<th>N&uacute;mero de p&aacute;ginas</th>
				<th>Disponible</th>
				<th style="width : 9%;">Precio</th>
			</tr>
			<c:forEach var="libro" items="${libros}">
			<tr>
				<td>${libro.ISBN}</td>
				<td>${libro.titulo}</td>
				<td>${libro.autor}</td>
				<td><fmt:formatDate value="${libro.fechaPublicacion}" pattern="dd/MM/yyyy"/>
				<td>${libro.genero}</td>
				<td style="text-align: right;">${libro.numeroPaginas}</td>
				<td style="text-align: center;">${libro.disponible}</td>
				<td style="text-align: right;">
					<fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${libro.precio}"/> €   
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>