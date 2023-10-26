package com.sudha.Numberprograms;

import java.util.Scanner;

public class AlternateArmstrong {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = scn.nextInt();
		System.out.println("Enter a second number");
		int b = scn.nextInt();
		int count = 1;

		for (int i = a; i <= b; i++) {
			if (Armstrong(i) == i) {
				count++;
				if (count % 2 == 0) {
					System.out.println(i);
				}
			}
		}
	}

	public static int Armstrong(int n) {
		int m = n;
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		int sum = 0;
		while (m > 0) {
			int rem = m % 10;
			int temp = 1;
			for (int j = 1; j <= count; j++) {
				temp *= rem;
			}
			sum += temp;
			m /= 10;
		}

		return sum;
	}
}
