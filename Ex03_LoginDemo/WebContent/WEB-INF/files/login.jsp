<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
		<style type="text/css">
			.err {
				border:1px solid red;
			}
		</style>
	</head>
	<body>
		<h1>Login Page</h1>
		<a href="welcome.do">Click here for Home Page</a>
		
		<html:form action="/authenticate">
			<table>
				<tr>
					<th colspan="2">Login</th>
				</tr>
				<tr>
					<td>Login Id</td>
					<td><html:text property="userid" errorStyleClass="err" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><html:password property="pass" errorStyle="border:1px solid red;" /></td>
				</tr>
				<tr>
					<th colspan="2"><html:submit value="Submit" /></th>
				</tr>
			</table>
		</html:form>
	</body>
</html>