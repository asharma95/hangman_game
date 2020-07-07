package com.hangmanGame.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hangmanGame.model.Word;
@Repository
public class DaoWord {
	private Word word;
	private String wordToDisplay;
	HashMap<Character, List<Integer>> characterPositions;
	@Autowired
	private WordJpaRepo repo;
	
	//word repo
	private int chances;
	public DaoWord() {}
	public Word getWord() {
		return word;
	}
	public void setWord(Word word) {
		this.word = word;
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
	public void changeDisplayWord(String character) {
		List<Integer> positions = characterPositions.get(character.charAt(0));
		StringBuilder string = new StringBuilder(wordToDisplay);
		if(positions != null) {
			for(Integer index : positions) {
				string.setCharAt(index*2, character.charAt(0));
			}
			this.setWordToDisplay(string.toString());
		} else {
			chances++;
		}
	}
	public int getChances() {
		return chances;
	}
	public void setRandomWordJPA() {
		this.setWord(repo.getRandomField().get(0));
	}

	
	
	
	
}
