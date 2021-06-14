package com.testleaf.training.java;

import java.util.Arrays;

public class FindAUB {

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
		int mergedArray[] = new int[input1.length + input2.length];
		int index = 0;

		for (int num : input1) {
			mergedArray[index] = num;
			index++;
		}

		for (int num : input2) {
			mergedArray[index] = num;
			index++;
		}

		int result[] = removeDuplicates(mergedArray);

		sortArray(result);

	}

	public static void main(String[] args) {

		int input1[] = { 1, 2, 3, 4, 1 };
		int input2[] = { 7, 3, 3, 4, 5, 6 };

		findAUB(input1, input2);

	}

}
