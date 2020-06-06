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
<title>INSERTAR AUTOMOVILES</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="../automoviles/insertarAuto" var="urlForm"></spring:url>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>

	<jsp:include page="../includes/menu.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos del automovil</span>
			</h3>
			<c:if test="${mensaje!=null}">
			<div class="alert alert-success" role="alert">${mensaje}</div>
		</c:if>
			
		</div>
	
		
		
		<form:form action="${urlForm}" method="post" modelAttribute="automovil" name="formulario">
			<div class="row">
				
				<div class="col-sm-3">
					<div class="form-group">
						<label for="placa">placa</label> <form:input type="text" 
							class="form-control" path="placa" id="placa"
							required="required" />
							
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="idPropietario">id Propietario</label> <form:input  
							class="form-control" path="idPropietario" id="idPropietario"
							required="required" />
					</div>
				</div>
				
		<div class="col-sm-3">
					<div class="form-group">
						<label for="numeroLicencia">numero Licencia</label> <form:input  
							class="form-control" path="numeroLicencia" id="numeroLicencia"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="estado">estado</label> <form:input  
							class="form-control" path="estado" id="estado"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="marca">marca</label> <form:input  
							class="form-control" path="marca" id="marca"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="modelo">modelo</label> <form:input  
							class="form-control" path="modelo" id="modelo"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="numeroChasis">numero Chasis</label> <form:input  
							class="form-control" path="numeroChasis" id="numeroChasis"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="cilindraje">cilindraje</label> <form:input  
							class="form-control" path="cilindraje" id="cilindraje"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="tipoCombustible">tipo Combustible</label> <form:input  
							class="form-control" path="tipoCombustible" id="tipoCombustible"
							required="required" />
					</div>
				</div>
				
				
			
					<div class="col-sm-3">
					<div class="form-group">
						<label for="color">color</label> <form:input  
							class="form-control" path="color" id="color"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="numeroMotor">numero Motor</label> <form:input  
							class="form-control" path="numeroMotor" id="numeroMotor"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="tipoCarroceria">tipo Carroceria</label> <form:input  
							class="form-control" path="tipoCarroceria" id="tipoCarroceria"
							required="required" />
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="fechMatricula">fecha Matricula</label> <form:input type="date"
							class="form-control" path="fechMatricula" id="fechMatricula"
							required="required" />
					</div>
				</div>
				
						<div class="col-sm-3">
					<div class="form-group">
						<label for="numeroPuertas">numero Puertas</label> <form:input  
							class="form-control" path="numeroPuertas" id="numeroPuertas"
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
	/*
		$(function() {

			$("#fechMatricula").datetimepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
*/
			$(function(){

			$("#bEnviar").click(function(){

				var placa = $("#placa").val();
				var idProp = $("#idPropietario").val();
				var numeroLicencia = $("#numeroLicencia").val();
				var modelo = $("#modelo").val();
				var cilindraje = $("#cilindraje").val();
				var numeroPuertas = $("#numeroPuertas").val();

				  expresion = /^[A-Z]{3}[0-9]{3}$/; 
				
				if((placa.length>6 || placa.length<6)  && !expresion.test(placa))
					{
							alert("LA PLACA NO ES VALIDA")
							return false;
					}
				if(isNaN(idProp))	
					{

							alert("EL ID NO ES VALIDO");
							return false;
					}
				if(isNaN(numeroLicencia))
					{

					alert("LA LICENCIA NO ES VALIDA");
					return false;

					}
				if(isNaN(modelo) || modelo.length>4)
				{

				alert("EL MODELO NO ES VALIDO");
				return false;

				}
				if(isNaN(cilindraje))
				{

				alert("EL CILINDRAJE NO ES VALIDO");
				return false;

				}
				if(isNaN(numeroPuertas) || numeroPuertas.length>2)
				{

				alert("EL NUMERO DE PUERTAS NO ES VALIDO");
				return false;

				}

				});

			});


			
		
			
		
	</script>
	


	
</body>
</html>
