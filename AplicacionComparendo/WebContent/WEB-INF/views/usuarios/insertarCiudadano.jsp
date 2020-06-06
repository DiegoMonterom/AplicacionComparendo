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
	
		
		
		<form:form action="${urlForm}" method="post" modelAttribute="ciudadano">
			<div class="row">
				
				<div class="col-sm-3">
					<div class="form-group">
						<label for="path">tipo documento</label> <form:select 
							class="form-control" path="tipoDocumento" id="tipoDocumento"
							required="required" >
							<form:option value="cedula">Cedula</form:option>
          					<form:option value="Tarjeta">Tarjeta de identidad</form:option>
          					</form:select>
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero documento</label> <form:input  
							class="form-control" path="numeroDocumento" id="numeroDocumento"
							required="required" />
					</div>
				</div>
				
		<div class="col-sm-3">
					<div class="form-group">
						<label for="path">nombre</label> <form:input  
							class="form-control" path="nombre" id="nombre"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">apellido</label> <form:input  
							class="form-control" path="apellido" id="apellido"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">tipo sangre</label> <form:select  
							class="form-control" path="tipoSangre" id="tipoSangre"
							required="required" >
							<form:option value="A">A</form:option>
          					<form:option value="B">B</form:option>
          					<form:option value="O">O</form:option>
          					<form:option value="c">AB</form:option>
          					</form:select>
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">factor sangre</label> <form:select  
							class="form-control" path="factorSangre" id="factorSangre"
							required="required" >
							<form:option value="-">+</form:option>
          					<form:option value="+">-</form:option>
          					</form:select>
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">fecha nacimiento</label> <form:input type="date" 
							class="form-control" path="fechaNacimiento" id="fechaNacimiento"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">direccion residencia</label> <form:input  
							class="form-control" path="direccionResidencia" id="direccionResidencia"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">edad</label> <form:input  
							class="form-control" path="edad" id="edad"
							required="required" />
					</div>
				</div>
				
				
			
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">telefono</label> <form:input  
							class="form-control" path="telefono" id="telefono"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">municipio</label> <form:input  
							class="form-control" path="municipio" id="municipio"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">email</label> <form:input  
							class="form-control" path="email" id="email"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">estatura</label> <form:input  
							class="form-control" path="estatura" id="estatura"
							required="required" />
					</div>
				</div>
				
				
				
				
				
				
				
		</div>
		
			
			
				

		

		
				
				
				
				
			
			
			<button type="submit" class="btn btn-danger" id="bEnviar">Guardar</button>
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

		$("#fechaNacimiento").datetimepicker({
			dateFormat : 'dd-mm-yy'
		});
	});

		$(function(){

		$("#bEnviar").click(function(){

			//var tipoDocumento = $("#tipoDocumento").val();
			var numeroDocumento = $("#numeroDocumento").val();
			var nombre = $("#nombre").val();
			var apellido = $("#apellido").val();
			//var tipoSangre = $("#tipoSangre").val();
			//var factorSangre = $("#factorSangre").val();
			var direccionResidencia = $("#direccionResidencia").val();
			var edad = $("#edad").val();
			var telefono = $("#telefono").val();
			var municipio = $("#municipio").val();
			var email = $("#email").val();
			var estatura = $("#estatura").val();
			
			
			
			
			if(isNaN(numeroDocumento))
				{
						alert("EL DOCUMENTO NO ES VALIDO")
						return false;
				}
			if(isNaN(edad))	
				{

						alert("EL ID NO ES VALIDO");
						return false;
				}
			if(isNaN(telefono))
				{

				alert("LA LICENCIA NO ES VALIDA");
				return false;

				}
			if(isNaN(estatura))
			{

			alert("EL MODELO NO ES VALIDO");
			return false;

			}
			
			});

		});


	</script>
</body>
</html>
