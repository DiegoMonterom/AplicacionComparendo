<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>USUARIO</title>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/videos/create" var="urlForm" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>

	<jsp:include page="../includes/menu.jsp" />

	<div class="container theme-showcase" role="main">


		<div class="table-responsive">
			<table class="table table-hover table-striped table-bordered">
				<tr>
					<th>numero documento</th>
					<th>tipo documento</th>
					<th>nombre</th>
					<th>apellido</th>
					<th>tipo sangre</th>
					<th>factor sangre</th>
					<th>fecha nacimiento</th>
					<th>direccion residencia</th>
					<th>edad</th>
					<th>telefono</th>
					<th>municipio</th>
					<th>email</th>
					<th>estatura</th>
					
				</tr>
				<c:forEach items="${usuario}" var="usuario">
					<tr>

						<td>${usuario.numerodocumento}</td>
						<td>${usuario.tipodocumento}</td>
						<td>${usuario.nombre}</td>
						<td>${usuario.apellido}</td>
						<td>${usuario.tiposangre}</td>
						<td>${usuario.factorsangre}</td>
						<td>${usuario.fechanacimiento}</td>
						<td>${usuario.direccionresidencia}</td>
						<td>${usuario.edad}</td>
						<td>${usuario.telefono}</td>
						<td>${usuario.municipio}</td>
						<td>${usuario.email}</td>
						<td>${usuario.estatura}</td>

						
					</tr>
				</c:forEach>
			</table>
		</div>

		<hr class="featurette-divider">

		<!-- FOOTER -->
		<jsp:include page="../includes/footer.jsp" />
	</div>
	<!-- /container -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>