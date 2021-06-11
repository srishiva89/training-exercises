package com.testleaf.training.java;

import java.util.Arrays;

public class FindWordsCount {

	private static void findNumberOfWords(String[] wordArray, int lengthOfWord) {

		int count = 0;

		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].length() == lengthOfWord) {
				count++;
			}
		}

		System.out.println("Input 1: " + Arrays.toString(wordArray));
		System.out.println("Input 2: " + lengthOfWord);
		System.out.println("Output : " + count);

	}

	public static void main(String[] args) {
		String[] wordArray = { "aa", "b", "cc", "ddd" };

		int lengthOfWord = Integer.parseInt(args[0]);

		findNumberOfWords(wordArray, lengthOfWord);
	}

}
