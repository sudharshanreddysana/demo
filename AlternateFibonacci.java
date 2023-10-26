package com.sudha.Numberprograms;

import java.util.Scanner;

public class AlternateFibonacci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		
		int count=0;
		while(a<n) {
					if(count%2==0)System.out.println(a);
			c=a+b;a=b;b=c;
			count++;
		}
	}
}
