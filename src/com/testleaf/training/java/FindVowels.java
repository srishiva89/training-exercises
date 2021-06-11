package com.testleaf.training.java;

public class FindVowels {

	static int count = 0;

	private static void findingVowels(String input) {

		String[] vowels = { "a", "e", "i", "o", "u" };

		for (int i = 0; i < vowels.length; i++) {
			if (input.contains(vowels[i])) {
				count++;
			}
		}
		System.out.println("Output is " + count);

	}

	public static void main(String[] args) {

		String input = args[0];
		findingVowels(input.toLowerCase());

	}

}
