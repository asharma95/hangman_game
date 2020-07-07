<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Hangman Game</title>
	</head>
	<body>
		<h2>Two player</h2>
		<form:form action="wordParse" modelAttribute="word">
			Input word for opponent to guess:<form:input path="word" />
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>