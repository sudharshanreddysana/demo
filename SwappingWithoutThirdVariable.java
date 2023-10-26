package com.sudha.Numberprograms;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		System.out.println("Enter value");
		int b=scn.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
