package com.sudha.Numberprograms;

import java.util.Scanner;

public class SwapingusingThirdVariable {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		System.out.println("Enter Value");
		int b=scn.nextInt();
		
		int c=a;
		 a=b;
		 b=c;
		 System.out.println("a value is"+a);
		 System.out.println("b value is"+b);
		 


	}

}
