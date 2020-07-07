package com.hangmanGame.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hangmanGame.model.Word;

public interface WordJpaRepo extends JpaRepository<Word, Integer> {
	@Query("Select w from Word w order by rand() ")
    public List<Word> getRandomField();
}
