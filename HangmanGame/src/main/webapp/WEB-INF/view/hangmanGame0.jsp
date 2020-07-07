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
		<p>Select character?</p>
		<a href="game/a">A</a> <a href="game/b">B</a> <a href="game/c">C</a> 
		<a href="game/d">D</a> <a href="game/e">E</a> <a href="game/f">F</a>
		<a href="game/g">G</a> <a href="game/h">H</a> <a href="game/i">I</a>
		<a href="game/j">J</a> <a href="game/k">K</a> <a href="game/l">L</a>
		<a href="game/m">M</a> <a href="game/n">N</a> <a href="game/o">O</a>
		<a href="game/p">P</a> <a href="game/Q">Q</a> <a href="game/r">R</a> 
		<a href="game/s">S</a><a href="game/t">T</a> <a href="game/u">U</a> 
		<a href="game/v">V</a><a href="game/W">W</a> <a href="game/x">X</a> 
		<a href="game/y">Y</a> <a href="game/z">Z</a> 
		<br><br>
		Word to Display: ${wordToDisplay}
	</body>
</html>