package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckTheFibonacci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		while(n>=a){
			if(a==n) {
				System.out.println("Is a Fibonacci");
				return;
			}
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("is not a fibonacci");

	}

}
