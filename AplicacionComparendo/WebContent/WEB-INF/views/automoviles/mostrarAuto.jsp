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
<title>AUTOMOVIL</title>
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
<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos del automovil</span>
			</h3>
		</div>

		<div class="table-responsive">
			<table class="table table-hover table-striped table-bordered">
				<tr>
					<th>placa</th>
					<th>id Propietario</th>
					<th>numero Licencia</th>
					<th>estado</th>
					<th>marca</th>
					<th>modelo</th>
					<th>numero Chasis</th>
					<th>cilindraje</th>
					<th>tipo Combustible</th>
					<th>color</th>
					<th>numero Motor</th>
					<th>tipo Carroceria</th>
					<th>fecha Matricula</th>
					<th>numero Puertas</th>
					
					
				</tr>
			
					<tr>

						<td>${auto.placa}</td>
						<td>${auto.idPropietario}</td>
						<td>${auto.numeroLicencia}</td>
						<td>${auto.estado}</td>
						<td>${auto.marca}</td>
						<td>${auto.modelo}</td>
						<td>${auto.numeroChasis}</td>
						<td>${auto.cilindraje}</td>
						<td>${auto.tipoCombustible}</td>
						<td>${auto.color}</td>
						<td>${auto.numeroMotor}</td>
						<td>${auto.tipoCarroceria}</td>
						<td>${auto.fechMatricula}</td>
						<td>${auto.numeroPuertas}</td>

						
					</tr>
		
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