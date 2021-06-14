package com.testleaf.training.java;

import java.util.Arrays;

public class FindAnB {

	private static int[] removeDuplicates(int[] input) {
		int length = input.length;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (input[i] == input[j]) {
					input[j] = input[length - 1];
					length--;
					j--;
				}
			}
		}

		int[] removedDuplicates = new int[length];
		for (int i = 0; i < length; i++) {
			removedDuplicates[i] = input[i];
		}

		return removedDuplicates;
	}

	private static void sortArray(int input[]) {
		int temp = 0;
		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(input));
	}

	private static void findAUB(int input1[], int input2[]) {
		int output1[] = removeDuplicates(input1);
		int output2[] = removeDuplicates(input2);

		// Find length of unique values
		int size = 0;
		for (int i = 0; i < output1.length; i++) {
			for (int j = 0; j < output2.length; j++) {
				if (output1[i] == output2[j]) {
					size++;
				}
			}
		}

		// create new array to store unique values
		int result[] = new int[size];
		int index = 0;
		for (int i = 0; i < output1.length; i++) {
			for (int j = 0; j < output2.length; j++) {
				if (output1[i] == output2[j]) {
					result[index] = output1[i];
					index++;
				}
			}
		}

		sortArray(result);

	}

	public static void main(String[] args) {

		int input1[] = { 1, 2, 3, 4, 1, 2 };
		int input2[] = { 7, 3, 3, 4, 5, 6, 1, 9 };

		findAUB(input1, input2);

	}

}
