package com.qa.exercise.hashmaps;

import java.util.HashMap;

public class MorseTranslator {

	private HashMap<String, String> MorseMap = new HashMap<>();

	public MorseTranslator() {

		this.MorseMap.put(".-", "a");
		this.MorseMap.put("-...", "b");
		this.MorseMap.put("-.-.", "c");
		this.MorseMap.put("-..", "d");
		this.MorseMap.put(".", "e");
		this.MorseMap.put("..-.", "f");
		this.MorseMap.put("--.", "g");
		this.MorseMap.put("....", "h");
		this.MorseMap.put("..", "i");
		this.MorseMap.put(".---", "j");
		this.MorseMap.put("-.-", "k");
		this.MorseMap.put(".-..", "l");
		this.MorseMap.put("--", "m");
		this.MorseMap.put("-.", "n");
		this.MorseMap.put("---", "o");
		this.MorseMap.put(".--.", "p");
		this.MorseMap.put("--.-", "q");
		this.MorseMap.put(".-.", "r");
		this.MorseMap.put("...", "s");
		this.MorseMap.put("-", "t");
		this.MorseMap.put("..-", "u");
		this.MorseMap.put("...-", "v");
		this.MorseMap.put(".--", "w");
		this.MorseMap.put("-..-", "x");
		this.MorseMap.put("-.--", "y");
		this.MorseMap.put("--..", "z");

	}

	public String translate(String input) {
		String[] inputArray = input.split(" ");
		String output = "";

		for (String value : inputArray) {
			output += MorseMap.get(value);
		}

		return output;

	}
}
