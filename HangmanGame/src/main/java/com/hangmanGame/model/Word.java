package com.hangmanGame.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Word {
	@Id
	int id;
	private String word;
	
	public Word() {}
	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
