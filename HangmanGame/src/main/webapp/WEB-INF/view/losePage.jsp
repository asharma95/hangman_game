<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Hangman Game</title>
	</head>
	<body>
		<h2>Hangman Game</h2>
		<h3>You have lost!</h3>
		<a href="returnHome">Home Page</a>
		<br><br>
		Word to Display: ${wordToDisplay}
		<br><br>
		<img src="<c:url value="/resources/img/7strike.png" />"/>
	</body>
</html>