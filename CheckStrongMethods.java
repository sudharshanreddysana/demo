package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckStrongMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		if(strong(n)==n)System.out.println("Is A Strong Number");
		else System.out.println("Is not a Strong number");

	}
	public static int strong(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=fact(rem);
			n/=10;
		}
		return sum;
	}
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}

}
