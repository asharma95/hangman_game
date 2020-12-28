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
	@Autowired
	private WordJpaRepo repo;
	
	public DaoWord() {}
	public Word setRandomWordJPA() {
		return repo.getRandomField();
	}
}
