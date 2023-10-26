package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value");
		int a = scn.nextInt();
		if (a == 0) {
			System.out.println("Is a WholeNumber");
			return;
		}
		if (a % 2 == 0)
			System.out.println("Is a EvenNumber");
		else
			System.out.println("Is a Oddnumber");

	}
}
