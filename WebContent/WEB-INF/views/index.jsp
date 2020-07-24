<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<meta charset="UTF-8">
<title> Titulo</title>
</head>
<body class="bg bg-dark">
<div class="container col-7 mx-auto bg bg-light">
	<h1 class="col-6 mx-auto text-center">Bienvenido al juego del numero mayor!</h1>
	<h4 class=" col-6 mx-auto text-center">Elige un numero entre 1 y 100 </h4>
	
	<h4 class="col-6 mx-auto bg-danger text-light text-center"> <c:out value="${contenido}" /> </h4>
	<h4 class="col-6 mx-auto bg-success <c:out value="${borde}" /> text-light text-center"> <c:out value="${ganaste}" /> </h4>
	<form action="NumeroMagico" class="col-6 mx-auto" method="post">
		<div class="col-12">
			<input type="text" class="form-control mb-5" name="numero">
			<input type="submit" class="btn btn-danger form-control mb-5" value="Adivinar">
		</div>
	</form>
</div>




</body>
</html>