package com.testleaf.training.java;

import java.util.Arrays;

public class FindSum {

	private static int findMax(int[] input) {
		int max = 0;

		for (int i = 0; i < input.length; i++) {
			if (max < input[i]) {
				max = input[i];
			}
		}

		return max;
	}

	private static int findMin(int[] input) {
		int min = input[0];

		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}

		return min;
	}

	private static void calculateSum(int[] input) {

		int max = findMax(input);
		int min = findMin(input);
		System.out.println("Given input: " + Arrays.toString(input));
		System.out.println("Max number: " + max);
		System.out.println("Min number: " + min);
		System.out.println("SUM of (" + max + "+" + min + ") = " + (max + min));

	}

	public static void main(String[] args) {

		int[] input = new int[args.length];

		for (int i = 0; i < args.length; i++)
			input[i] = Integer.parseInt(args[i]);

		calculateSum(input);
	}

}
