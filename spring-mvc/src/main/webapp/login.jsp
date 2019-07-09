<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%> --%>
<%-- <%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<form method = "post" action="login.lti">
		Enter username : <input type = "text" name = "username"/><br/>
		Enter password : <input type = "text" name = "password"/><br/>
		<button type = "submit">Login</button>
	</form>
	<h2>${warning}</h2>
<f:view>

</f:view>
</body>
</html>