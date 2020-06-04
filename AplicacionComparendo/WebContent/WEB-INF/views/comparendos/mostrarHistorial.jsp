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
<title>HISTORIAL</title>
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
					<th>id Comaprendo</th>
					<th>numero Comparendo</th>
					<th>fecha infraccion</th>
					<th>accidente</th>
					<th>reporta Fuga</th>
					<th>inmovilizacion</th>
					<th>hora Infraccion</th>
					<th>estado</th>
					
					
				</tr>
				<c:forEach items="${historial}" var="historial">
					<tr>

						<td>${historial.idComparendo}</td>
						<td>${historial.numeroComaprendo}</td>
						<td>${historial.fechaInfraccion}</td>
						<td>${historial.accidente}</td>
						<td>${historial.reportaFuga}</td>
						<td>${historial.inmovilizacion}</td>
						<td>${historial.horaInfraccion}</td>
						<td>${historial.estado}</td>
						

						
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