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
<title>Login</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="/login" var="urlForm"></spring:url>
<spring:url value="menuPrincipal/consultarHistorial" var="comp2"></spring:url>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>

	<jsp:include page="../includes/menu.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos del login</span>
			</h3>
		</div>
	
		
	
		<form:form action="${urlForm}" method="post" modelAttribute="funcionario">
			
			<div class="row" style="text-align:center;">
				
				<div class="col-sm-3" >
					<div class="form-group">
						<label for="path">Username</label> <form:input type="text" 
							class="form-control" path="usuario" id="usuario"
							required="required" />
					
				
				
					
					
						<label for="path">Password</label> <form:password  
							class="form-control" path="contra" id="password"
							required="required" />
					
			</div>
				</div>
	
				
				
		</div>
		
			
			
				

		

		
				
				
				
				
			
			
			<button type="submit" class="btn btn-danger" >Ingresar</button>
		
		</form:form>

	<!--<form:form action="${comp2}" method="get"><a href="${comp2}">VER HISTORIAL COMPARENDO USUARIO</a></form:form>-->


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
			$("#fechaIngreso").datepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
		
	</script>
</body>
</html>
