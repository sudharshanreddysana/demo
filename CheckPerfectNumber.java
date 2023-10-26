package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)sum=sum+i;
		}
		if(sum==n)System.out.println("Is a Perfect Number");
		else System.out.println("Is not a perfect number");

	}

}
