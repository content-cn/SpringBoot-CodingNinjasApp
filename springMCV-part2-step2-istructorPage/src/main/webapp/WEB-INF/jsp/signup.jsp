<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<h1>This is the sign up page</h1>
<form:form action="registerUser" modelAttribute="user">
 	User Name<form:input path="userName" />
	<br />
	<br />
 	Location<form:select path="location">
		<form:option value="India"></form:option>
		<form:option value="USA"></form:option>
	</form:select>
	<br />
	<br />
 	Gender <br />
	Male<form:radiobutton path="gender" value="male" />
    female<form:radiobutton path="gender" value="female" />
	<br />
	<br />
	<input type="submit" />
</form:form>
</html>