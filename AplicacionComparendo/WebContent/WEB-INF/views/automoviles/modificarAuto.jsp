<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>MODIFICAR AUTOMOVILES</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="../automoviles/consultarAuto" var="urlForm1"></spring:url>
<spring:url value="../automoviles/modificarAuto" var="urlForm"></spring:url>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>

	<jsp:include page="../includes/menu.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos a modificar del automovil</span>
			</h3>
		</div>
	
			<form:form action="${urlForm1}" method="post" modelAttribute="automovil">
			<div class="row">
				
				<div class="col-sm-3">
					<div class="form-group">
						<label for="path">Inserte la placa del auto</label> <form:input type="text" 
							class="form-control" path="placa" id="placa"
							required="required" />
					</div>
				</div>
				
				
				
		</div>
		

			<button type="submit" class="btn btn-danger">Consultar</button>
		</form:form>
		
		
		<form:form action="${urlForm}" method="post" modelAttribute="automovil">
			<div class="row">
				
				<div class="col-sm-3">
					<div class="form-group">
						<label for="path">placa</label> <form:input type="text" 
							class="form-control" path="placa" id="placa"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">id Propietario</label> <form:input  
							class="form-control" path="idPropietario" id="idPropietario"
							required="required" />
					</div>
				</div>
				
		<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Licencia</label> <form:input  
							class="form-control" path="numeroLicencia" id="numeroLicencia"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">estado</label> <form:input  
							class="form-control" path="estado" id="estado"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">marca</label> <form:input  
							class="form-control" path="marca" id="marca"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">modelo</label> <form:input  
							class="form-control" path="modelo" id="modelo"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Chasis</label> <form:input  
							class="form-control" path="numeroChasis" id="numeroChasis"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">cilindraje</label> <form:input  
							class="form-control" path="cilindraje" id="cilindraje"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">tipo Combustible</label> <form:input  
							class="form-control" path="tipoCombustible" id="tipoCombustible"
							required="required" />
					</div>
				</div>
				
				
			
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">color</label> <form:input  
							class="form-control" path="color" id="color"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Motor</label> <form:input  
							class="form-control" path="numeroMotor" id="numeroMotor"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">tipo Carroceria</label> <form:input  
							class="form-control" path="tipoCarroceria" id="tipoCarroceria"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">fecha Matricula</label> <form:input  
							class="form-control" path="fechMatricula" id="fechMatricula"
							required="required" />
					</div>
				</div>
				
						<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Puertas</label> <form:input  
							class="form-control" path="numeroPuertas" id="numeroPuertas"
							required="required" />
					</div>
				</div>
				
				
				
				
				
				
		</div>
		
			
			
				

		

		
				
				
				
				
			
			
			<button type="submit" class="btn btn-danger">Guardar</button>
		</form:form>

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
	<script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
		$(function() {
			$("#fechMatricula").datepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
		
	</script>
</body>
</html>
