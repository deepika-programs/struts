<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Landing Page</title>
	</head>
	<body>
	<h1>Landing</h1>
		<bean:write name="loginform" property="userid"/>
	</body>
</html>