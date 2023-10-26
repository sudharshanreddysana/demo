package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckArmMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		if(arm(n)==n)System.out.println("is a Armstrong Number");
		else System.out.println("Is not a Armstrong Number");
		
	}
	public static int arm(int n) {
		int len=length(n);
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=product(rem,len);
			n/=10;
		}
		return sum;
	}
	public static int length(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int product(int base,int pow) {
		int fact=1;
		for(int i=1;i<=pow;i++) {
			fact*=base;
		}
		return fact;
	}

}
