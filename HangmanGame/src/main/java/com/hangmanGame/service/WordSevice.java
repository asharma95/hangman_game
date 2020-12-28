package com.hangmanGame.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hangmanGame.dao.DaoWord;
import com.hangmanGame.model.Word;
@Service
public class WordSevice {
	private Word word;
	private String wordToDisplay;
	HashMap<Character, List<Integer>> characterPositions;
	private int charactersToGuess;
	private int chances;
	@Autowired
	private DaoWord dao;
	
	public Word getWord() {
		return word;
	}
	/*
	assigns all necesarry data for new assigned word for hangman game
	such as character positions
	characters to guess
	under score word to display
	mapping specific underscore charcters to characters in word
	 */
	public void setWord(Word word) {
		this.word = word;
		this.charactersToGuess = this.word.getWord().length();
		this.wordToDisplay=IntStream.range(0, word.getWord().length()).mapToObj(i -> "_ ").collect(Collectors.joining(""));
		characterPositions = new HashMap<Character, List<Integer>>();
		for (int i = 0; i < word.getWord().length(); i++) {
			if(characterPositions.containsKey(word.getWord().charAt(i))) {
				characterPositions.get(word.getWord().charAt(i)).add(i);
			} else {
				List<Integer> positions = new ArrayList<>();
				positions.add(i);
				characterPositions.put(word.getWord().charAt(i), positions);
			}
		}
		chances = 0;
	}
	public String getWordToDisplay() {
		return wordToDisplay;
	}
	public void setWordToDisplay(String wordToDisplay) {
		this.wordToDisplay = wordToDisplay;
	}
	public void changeWordToDisplay(String character) {
		List<Integer> positions = characterPositions.get(character.charAt(0));
		StringBuilder string = new StringBuilder(wordToDisplay);
		if(positions != null) {
			for(Integer index : positions) {
				string.setCharAt(index*2, character.charAt(0));
				charactersToGuess--;
			}
			if(!positions.isEmpty()) {
				characterPositions.put(character.charAt(0), new ArrayList<>());
			}
			this.setWordToDisplay(string.toString());
		} else {
			chances++;
		}
	}
	public int getChances() {
		return chances;
	}
	public void setRandomWord() {
		this.setWord(dao.setRandomWordJPA());
	}
	public int getCharactersToGuess() {
		return charactersToGuess;
	}
}
