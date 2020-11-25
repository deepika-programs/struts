<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Struts-taglib</title>
	</head>
	<body>
		<h1>Form</h1>
		
		<html:form action="/landing">
			<table>
				<tr>
					<th colspan="2">Login</th>
				</tr>
				<tr>
					<td>Id</td>
					<td><html:text property="id" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><html:text property="name" /></td>
				</tr>
				<tr>
					<td>Hobbies</td>
					<td>
						<html:checkbox property="hobbies" value="Singing" styleId="singing"/> <label for="singing">Singing</label>
						<html:checkbox property="hobbies" value="Dancing" styleId="dancing"/> <label for="dancing">Dancing</label>
						<html:checkbox property="hobbies" value="Reading" styleId="reading"/> <label for="reading">Reading</label>
					</td>
				</tr>
				<tr>
					<th colspan="2"><html:submit value="Submit" /></th>
				</tr>
			</table>
		</html:form>
	</body>
</html>