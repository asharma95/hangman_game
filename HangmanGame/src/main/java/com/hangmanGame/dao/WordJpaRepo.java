package com.hangmanGame.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hangmanGame.model.Word;

public interface WordJpaRepo extends JpaRepository<Word, Integer> {
	@Query(value = "SELECT * FROM word_database.word order by rand() limit 1", nativeQuery=true)
    public Word getRandomField();
}
