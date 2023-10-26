package com.sudha.Numberprograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int m=n*n;
		int sum=0;
		while(m>0) {
			sum+=m%10;
			m/=10;
		}
		if(sum==n)System.out.println("Is a Neon Number");
		else System.out.println("Is not a Neon Number");

	}

}
