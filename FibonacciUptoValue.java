package com.sudha.Numberprograms;

import java.util.Scanner;

public class FibonacciUptoValue {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int a=0;int b=1;int c=0;
		while(a<=n){
			System.out.println(a);
			c=a+b;
			a=b;b=c;
		}

	}

}
