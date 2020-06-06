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
<title>TIPO USUARIO</title>

<spring:url value="/resources" var="urlPublic"></spring:url>

<spring:url value="../menuUsuarios/insertarCiudadano" var="user1"></spring:url>
<spring:url value="../menuUsuarios/insertarConductor" var="user2"></spring:url>
<spring:url value="../menuUsuarios/insertarFuncionario" var="user3"></spring:url>
<spring:url value="../menuUsuarios/insertarPolicia" var="user4"></spring:url>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body>
	<div style="text-align:center;">
	<jsp:include page="../includes/menu.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Ingrese los datos del login</span>
			</h3>
		</div>
	
			
		
 			<table cellspacing="100" >

			
			<tr>
	    
	         <td colspan="1">  <form:form  action="${user1}" method="get"><button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Insertar Ciudadano</button> </form:form></td> 
	           <td >  <form:form  action="${user2}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Insertar Conductor</button> </form:form></td> 
	         	<td >  <form:form  action="${user3}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Insertar Funcionario</button> </form:form></td> 
	         	<td > <form:form  action="${user4}" method="get">  <button type="submit" class="btn btn-primary" style='width:210px; height:50px' >Insertar Policia</button> </form:form></td>
	         
	          </tr>
	          
	         
	          
	         
	          	             
	          
	          </table>
	
	
	
		
	
		
		


		<hr class="featurette-divider">

		<!-- FOOTER -->
		<jsp:include page="../includes/footer.jsp" />

	</div>
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















   