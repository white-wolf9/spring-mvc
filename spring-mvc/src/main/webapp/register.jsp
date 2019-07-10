<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action="register.lti" enctype="multipart/form-data">
	 Name : <input type = "text" name = "name" /> <br/>
	 Age : <input type = "number" name = "age" /> <br/>
	 Email : <input type = "email" name = "email" /> <br/>
	 City : <input type = "text" name = "city" /> <br/>
	 Upload your profile Pic  : <input type = "file" name = "profilePic" /> <br/>
	 <button type = "submit">Register</button>
</form>

<h1>You have been successfully registered : ${user}</h1>
</body>
</html>