package com.sudha.Numberprograms;

import java.util.Scanner;

public class LostDigSameNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=scn.nextInt();
		System.out.println("Enter first value");
		int b=scn.nextInt();
		System.out.println("Enter first value");
		int c=scn.nextInt();
		
		if((a%10==b%10)&&(b%10==c%10)&&(a%10==c%10)) {
			System.out.println("Is a Same Number");
		}
		else System.out.println("Is not a Same number");

	}

}
