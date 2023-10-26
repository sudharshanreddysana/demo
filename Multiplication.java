package com.sudha.Numberprograms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		for(int i=1;i<=10;i++) {
			int product=i*a;
			System.out.println(a+"*"+i+"="+product);
		}
	}

}
