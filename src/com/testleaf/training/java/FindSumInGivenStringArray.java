package com.testleaf.training.java;

import java.util.Arrays;

public class FindSumInGivenStringArray {

	private static void findSum(String[] input) {
		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			String str = input[i];

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				try {
					sum = sum + Integer.parseInt(String.valueOf(ch));
				} catch (NumberFormatException exception) {
					// SKIP
				}

			}
		}
		System.out.println("Given input: " + Arrays.toString(input));
		System.out.println("Sum of given input is " + sum);
	}

	public static void main(String[] args) {
		findSum(args);
	}

}
