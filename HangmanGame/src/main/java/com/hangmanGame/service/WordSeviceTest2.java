package com.hangmanGame.service;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.hangmanGame.model.Word;

class WordSeviceTest2 {

	WordSevice service;
	TestInfo testInfo;
	TestReporter testReporter;
	@BeforeAll
	public static void beforeAllInit() {
		System.out.println("Before all has run");
	}
	@AfterEach
	public void cleanup() {
		System.out.println("Cleaning up...");
	}
	@BeforeEach
	public void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo=testInfo;
		this.testReporter=testReporter;
		System.out.println("Intializing..");
		service = new WordSevice();
	}
	@Test
	//@RepeatedTest(5)
	public void test() {
		System.out.println("Testing...");
		Word word = new Word("dog");
		service.setWord(word);
		assertEquals("dog", service.getWord().getWord());
	}
	@Test
	@DisplayName("Unnecessary Test")
	@EnabledOnOs(OS.LINUX)
	public void test2() {
		System.out.println("Testing 2...");
	}
	@Nested
	class NestTest {
		@Test
		@DisplayName("Test 3")
		public void test3() {
			System.out.println("Test3 in Nested test");
		}
		@Test
		@DisplayName("Test 4")
		public void test4() {
			System.out.println("Test4 in Nested test");
		}
	}
}
