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
<title>INSERTAR USUARIO</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="../usuarios/insertarUsuario" var="urlForm"></spring:url>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>

	<jsp:include page="../includes/menu.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos de la persona</span>
			</h3>
		</div>
	
		
		
		<form:form action="${urlForm}" method="post" modelAttribute="policia">
			<div class="row">
				
				<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Documento</label> <form:input type="text" 
							class="form-control" path="numeroDocumentoPolicia" id="numeroDocumentoPolicia"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">nombre</label> <form:input  
							class="form-control" path="nombrePolicia" id="nombrePolicia"
							required="required" />
					</div>
				</div>
				
		<div class="col-sm-3">
					<div class="form-group">
						<label for="path">apellido</label> <form:input  
							class="form-control" path="apellidoPolicia" id="apellidoPolicia"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Policia</label> <form:input  
							class="form-control" path="numeroPolicia" id="numeroPolicia"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">placa Policia</label> <form:input  
							class="form-control" path="placaPolicia" id="placaPolicia"
							required="required" />
					</div>
				</div>
				
			
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">entidad</label> <form:input  
							class="form-control" path="entidadPolicia" id="entidadPolicia"
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
			$("#fechanacimiento").datepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
		
	</script>
</body>
</html>
