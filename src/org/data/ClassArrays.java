package org.data;

import java.util.Arrays;

public class ClassArrays {
	public static void main(String[] args) {
		int var[] = new int[5];

		var[0] = 10;
		var[1] = 50;
		var[2] = 30;
		var[3] = 40;
		var[4] = 20;
		// Normal Arrays

		System.out.println(var[3]);

		// to find the array length
		System.out.println(var.length);

		// Normal for loop
		System.out.println("Normal loop");
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
		// enhanced loop
		System.out.println("Enhanced loop");
		for (int x : var) {
			System.out.println(x);
			// to sort arrays
			Arrays.sort(var);
		}
		System.out.println(Arrays.toString(var));
	}

}
                        