<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Struts-taglib</title>
	</head>
	<body>
		<h1>Struts-taglib</h1>
		<bean:write name="welcomeActionForm" property="id"/>
		<bean:write name="welcomeActionForm" property="name"/>
		
		<logic:iterate name="welcomeActionForm" property="hobbies" id="hobby">
			<bean:write name="hobby"/>
		</logic:iterate>
		
		
		
	</body>
</html>