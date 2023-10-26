package com.sudha.Numberprograms;

import java.util.Scanner;

public class UntilSingle9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENter value");
		/*
		 * int n=scn.nextInt();
		 * 
		 * int tot=n*3; int add=tot+3; int mul=add*3;
		 * 
		 * int sum=0; while(mul>0) { int rem=mul%10; sum+=rem; mul/=10; }
		 * if(sum==9)System.out.println("same number 9"); else
		 * System.out.println("Not a same number");
		 */

		/*
		 * int n=scn.nextInt(); int tot=n+n; int add=tot+80; int half=add/2; int
		 * ret=half-n; System.out.println(ret);
		 */

		int n = scn.nextInt();
		int sum = 0;
		do {
			sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem;
				n /= 10;
			}
			n=sum;
		} while (n > 9);
		System.out.println(sum);
	}

}
