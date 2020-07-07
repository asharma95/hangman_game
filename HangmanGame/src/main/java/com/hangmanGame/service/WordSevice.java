package com.hangmanGame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hangmanGame.dao.DaoWord;
import com.hangmanGame.model.Word;
@Service
public class WordSevice {
	@Autowired
	private DaoWord dao;
	
	public Word getWord() {
		return dao.getWord();
	}
	public void setWord(Word word) {
		dao.setWord(word);
	}
	public String getWordtoDisplay() {
		return dao.getWordToDisplay();
	}
	public void setWordToDisplay(String wordToDisplay) {
		dao.setWordToDisplay(wordToDisplay);
	}
	public void changeWordToDisplay(String character) {
		 dao.changeDisplayWord(character);
	}
	public int getChances() {
		return dao.getChances();
	}
	public void setRandomWord() {
		dao.setRandomWordJPA();
	}
	public int getCharactersToGuess() {
		return dao.getCharactersToGuess();
	}
}
