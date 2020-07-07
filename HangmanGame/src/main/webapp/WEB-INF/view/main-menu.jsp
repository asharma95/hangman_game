<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
			<h2>Hangman Game</h2>
			<p>What game mode would you like to select?</p>
		<form action="players" modelAttribute="playerNum">
		  <input type="radio" id="playerNum" name="playerNum" value="1">
		  <label for="playerNum1">1 Player</label><br>
		  <input type="radio" id="playerNum" name="playerNum" value="2">
		  <label for="playerNum1">2 Player</label><br>
		  <input type="submit" value="Submit">
		</form>
</body>
</html>
