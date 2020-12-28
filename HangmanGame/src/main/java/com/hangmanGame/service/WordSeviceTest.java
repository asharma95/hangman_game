package com.hangmanGame.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.hangmanGame.model.Word;

public class WordSeviceTest {
	WordSevice service;
	@BeforeClass
	public static void beforeAllInit() {
		System.out.println("Before all has run");
	}
	@After
	public void cleanup() {
		System.out.println("Cleaning up...");
	}
	@Before
	public void init() {
		System.out.println("Intializing..");
		service = new WordSevice();
	}
	@Test
	public void test() {
		System.out.println("Testing...");
		Word word = new Word("dog");
		service.setWord(word);
		assertEquals("dog", service.getWord().getWord());
	}
	@Test
	@EnabledOnOs(OS.LINUX)
	public void test2() {
		System.out.println("Testing 2...");
	}
}
