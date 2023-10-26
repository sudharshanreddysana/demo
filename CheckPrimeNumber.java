package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		if(n==1) {
			System.out.println("Is not a primenumber");
			return;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {System.out.println("Is not a primenumber");
				return;
			}
			
		}
		System.out.println("Is a primt Number");

	}

}
