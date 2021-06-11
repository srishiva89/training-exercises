package com.testleaf.training.java;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		if (0 != args.length) {
			sb.append("\"");
		}
		
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
			if (i != (args.length - 1)) {
				sb.append(", ");
			}else {
				sb.append("\"");
			}
		}

		System.out.println("Given input: " + Arrays.toString(args));
		System.out.println("Output : " + sb);

	}

}
