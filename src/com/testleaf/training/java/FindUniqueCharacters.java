package com.testleaf.training.java;

public class FindUniqueCharacters {

	private static void printUniqueCharacters(String input) {
		String temp = "";

		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			if (temp.indexOf(current) == -1) {
				temp = temp + current;
			}
		}
		System.out.println("Input: " + input);
		System.out.println("Output: " + temp);
	}

	public static void main(String[] args) {
		printUniqueCharacters(args[0]);
	}

}
