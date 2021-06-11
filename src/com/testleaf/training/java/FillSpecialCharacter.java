package com.testleaf.training.java;

import java.util.Arrays;

public class FillSpecialCharacter {

	private static void fillSpecialCharacter(int index) {
		String[] input = { "abcd", "da", "ram","bdf","x" };

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (index < str.length()) {
				sb.append(str.charAt(index));
			} else {
				sb.append("$");
			}
		}
		System.out.println("Input: " + Arrays.toString(input));
		System.out.println("Output: " + sb);
	}

	public static void main(String[] args) {

		int index = Integer.parseInt(args[0]) - 1;
		fillSpecialCharacter(index);
	}

}
