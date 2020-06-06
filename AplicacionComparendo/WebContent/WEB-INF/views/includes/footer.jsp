<!-- FOOTER -->
   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <spring:url value="/login" var="urlForm"></spring:url>
<footer>
	<p class="pull-right">
	<form:form action="${urlForm}" method="post"><a href="#">VOLVER AL MENÚ PRINCIPAL</a></form:form>
	</p>
	<p>
		&copy; 2020 APLICATIVO COMPARENDOS,  &middot; <a href="#">Privacy</a>
		&middot; <a href="#">Terms</a>
	</p>
</footer>