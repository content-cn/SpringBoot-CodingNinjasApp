<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
 <h1>This is the sign up page</h1>
 <form:form action="register" modelAttribute="user">
 	User Name<form:input path="userName"/>
 	<br/><br/>
 	Location<form:input path="location"/>
 	<br/><br/>
 	<input type="submit"/>
 	</form:form>
</html>