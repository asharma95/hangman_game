package com.hangmanGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.hangmanGame.model.Word;
import com.hangmanGame.service.WordSevice;

@Controller
public class hangmanController {
	@Autowired
	private WordSevice service;
	
	@RequestMapping("/")
	public String homePage() {
		return "main-menu";
	}
	
	@RequestMapping("/players{playerNum}")
	public String gameDecision(@RequestParam String playerNum, Model model) {
		if(playerNum.equalsIgnoreCase("1")) {
			service.setRandomWord();
			model.addAttribute("word", service.getWord().getWord());
			model.addAttribute("wordToDisplay", service.getWordToDisplay());
			int chances = service.getChances();
			model.addAttribute("chances", chances);
			return "hangmanGame0";
		} else {
			model.addAttribute("word", new Word());
			return "two-player-hangman";
		}
	}
	
	@RequestMapping("/wordParse")
	public String wordParse(@ModelAttribute("word") Word word, Model model) {
		service.setWord(word);
		return "redirect:/game";
	}
	@RequestMapping("/game")
	public String game(Model model) {
		model.addAttribute("wordToDisplay", service.getWordToDisplay());
		int chances = service.getChances();
		model.addAttribute("chances", chances);
		if(chances == 0) {
			return "hangmanGame0";
		} else if(service.getCharactersToGuess() == 0){
			return "winPage";
		} else if(chances == 7) {
			return "losePage";
		} else {
			return "hangmanGame1";
		}
	}
	@RequestMapping("/game/{character}")
	public String changeWord(@PathVariable String character) {
		service.changeWordToDisplay(character);
		return "redirect:/game";
	}
	@RequestMapping("/returnHome")
	public String returnHome() {
		return "redirect:/";
	}
}
