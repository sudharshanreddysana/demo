package com.sudha.Numberprograms;

import java.util.Scanner;

public class FibonacciLowToUpp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower value");
		int l=scn.nextInt();
		System.out.println("Enter upper value");
		int u=scn.nextInt();
		int a=0,b=1,c=0;
		while(!(u<a)) {
			if(a>=l) {
				System.out.println(a);
			}
			c=a+b;a=b;b=c;
		}

	}

}
