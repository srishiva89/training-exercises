package com.testleaf.training.java;

public class FindLeapYear {

	private static boolean isLeapYear(int year) {
		// Check if the year is divisible by 4 but not 100
		// Check if the year is divisible by 400
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);

		System.out.println(year + " is leap year - " + isLeapYear(year));

	}

}
