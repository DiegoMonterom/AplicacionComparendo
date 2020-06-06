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
<title>MENU PRINCIPAL</title>

<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="menuPrincipal/insertarAuto" var="auto1"></spring:url>
<spring:url value="menuPrincipal/consultarAuto" var="auto2"></spring:url>
<spring:url value="menuPrincipal/modificarAuto" var="auto3"></spring:url>
<spring:url value="menuPrincipal/insertarUsuario" var="user1"></spring:url>
<spring:url value="menuPrincipal/consultarUsuario" var="user2"></spring:url>
<spring:url value="menuPrincipal/modificarUsuario" var="user3"></spring:url>
<spring:url value="menuPrincipal/insertarComparendo" var="comp1"></spring:url>
<spring:url value="menuPrincipal/consultarHistorial" var="comp2"></spring:url>

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
	    
	         <td colspan="1">  <form:form  action="${auto1}" method="get"><button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Insertar Auto</button> </form:form></td> 
	           <td></td>
	           <td >  <form:form  action="${auto2}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Consultar Auto</button> </form:form></td> 
	         	<td >  <form:form  action="${auto3}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Modificar Auto</button> </form:form></td> 
	         
	          </tr>
	          
	          <tr>
	          <td colspan="2" > <form:form  action="${user1}" method="get">  <button type="submit" class="btn btn-primary" style='width:210px; height:50px' >Insertar Usuario</button> </form:form></td>
	           <td>   <form:form  action="${user2}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px' >Consultar Usuario</button></form:form></td> 
	       		<td >  <form:form  action="${user3}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px'>Modificar usuario</button> </form:form></td> 
	          
	          </tr>
	          
	            <tr>
	          <td colspan="2">  <form:form  action="${comp1}" method="get"> <button type="submit" class="btn btn-primary" style='width:210px; height:50px' >Insertar Comparendo</button></form:form></td>
	         <td >  <form:form  action="${comp2}" method="get">  <button type="submit" class="btn btn-primary" style='width:210px; height:50px' >Consultar historial Comparendos</button></form:form></td> 
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















   