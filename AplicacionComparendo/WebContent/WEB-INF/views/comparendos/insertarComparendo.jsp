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
<title>INSERTAR COMPARENDO</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="../comparendos/insertarComparendo" var="urlForm"></spring:url>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>

	<jsp:include page="../includes/menu.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos del comparendo</span>
			</h3>
				<c:if test="${mensaje!=null}">
			<div class="alert alert-success" role="alert">${mensaje}</div>
		</c:if>
		</div>
	
		
		
		<form:form action="${urlForm}" method="post" modelAttribute="comparendo">
			<div class="row">
				
		
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">numero Comparendo</label> <form:input  
							class="form-control" path="numeroComaprendo" id="numeroComaprendo"
							required="required" />
					</div>
				</div>
				
		<div class="col-sm-3">
					<div class="form-group">
						<label for="path">fecha Infraccion</label> <form:input  type="date"
							class="form-control" path="fechaInfraccion" id="fechaInfraccion"
							required="required" />
					</div>
				</div>
				
				<div class="col-sm-3">
					<div class="form-group">
						<label for="path">hora Infraccion</label> <form:input type="time"
							class="form-control" path="horaInfraccion" id="horaInfraccion"
							required="required" />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">accidente</label> <form:select  
							class="form-control" path="accidente" id="accidente"
							required="required" >
							<form:option value="true">Si</form:option>
          					<form:option value="false">No</form:option>
          					</form:select>
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">reporta Fuga</label> <form:select  
							class="form-control" path="reportaFuga" id="reportaFuga"
							required="required" >
							<form:option value="true">Si</form:option>
          					<form:option value="false">No</form:option>
          					</form:select>
					</div>
				</div>
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">inmovilizacion</label> <form:select  
							class="form-control" path="inmovilizacion" id="inmovilizacion"
							required="required" >
							<form:option value="true">Si</form:option>
          					<form:option value="false">No</form:option>
          					</form:select>
					</div>
				</div>
				
					
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">No. Identificacion testigo</label> <form:input  
							class="form-control" path="cedulaTestigo" id="cedulaTestigo"
							 />
					</div>
				</div>
				
					
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">Tipo infraccion</label> <form:input  
							class="form-control" path="idInfraccion" id="idInfraccion"
							 />
					</div>
				</div>
				
					
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">No. Identificacion policia</label> <form:input  
							class="form-control" path="cedulaPolicia" id="cedulaPolicia"
							 />
					</div>
				</div>
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">direccion</label> <form:input  
							class="form-control" path="direccion" id="direccion"
							 />
					</div>
				</div>
				
							<div class="col-sm-3">
					<div class="form-group">
						<label for="path">placa automovil</label> <form:input  
							class="form-control" path="placa" id="placa"
							 />
					</div>
				</div>
				
				
					
				
				
					<div class="col-sm-3">
					<div class="form-group">
						<label for="path">estado</label> <form:select  
							class="form-control" path="estado" id="estado"
							required="required" >
							<form:option value="activo">activo</form:option>
          					<form:option value="pagado">pagado</form:option>
          					<form:option value="vencido">vencido</form:option>
          					</form:select>
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
			$("#horaInfraccion").datetimepicker({
				format: 'hh:ii'
				});
			/*
			$("#fechaInfraccion").datetimepicker({
				dateFormat : 'dd-mm-yy'
			});
			*/

		});

		$(function(){

			$("#bEnviar").click(function(){

				var numeroComaprendo = $("#numeroComaprendo").val();
				var horaInfraccion = $("#horaInfraccion").val();
				
				var inmovilizacion = $("#inmovilizacion").val();
				var reportaFuga = $("#reportaFuga").val();
				var accidente = $("#accidente").val();
				
				if(isNaN(numeroComaprendo))
					{
							alert("EL NUMERO NO ES VALIDO")
							return false;
					}
				if('inmovilizacion'=='true')
					{

					inmovilizacion=true;
					return true;
							
					}
				else
					{
					inmovilizacion=false;
					return true;
					}
				if('accidente'=='true')
				{

					accidente=true;
				return true;
						
				}
			else
				{
				accidente=false;
				return true;
				}
				if('reportaFuga'=='true')
				{

					reportaFuga=true;
				return true;
						
				}
			else
				{
				reportaFuga=false;
				return true;
				}


				
				});

			});


			

		
	</script>
</body>
</html>
