package com.testleaf.training.java;

public class Calculator {

	private static void addition(int number1, int number2) {
		System.out.println("Addition of (" + number1 + "+" + number2 + ") = " + (number1 + number2));
	}

	private static void subtraction(int number1, int number2) {
		System.out.println("Subtraction of (" + number1 + "-" + number2 + ") = " + (number1 - number2));
	}

	private static void multiplication(int number1, int number2) {
		System.out.println("Multiplication of (" + number1 + "*" + number2 + ") = " + (number1 * number2));
	}

	private static void division(int number1, int number2) {
		System.out.println("Division of (" + number1 + "%" + number2 + ") = " + (number1 % number2));
	}

	public static void main(String[] args) {

		int option = Integer.parseInt(args[0]);

		int number1 = Integer.parseInt(args[1]);

		int number2 = Integer.parseInt(args[2]);

		switch (option) {

		case 1:
			addition(number1, number2);
			break;
		case 2:
			subtraction(number1, number2);
			break;
		case 3:
			multiplication(number1, number2);
			break;
		case 4:
			division(number1, number2);
			break;
		default:
			System.out.println("Invalid Operation");
		}
		
		

	}

}
