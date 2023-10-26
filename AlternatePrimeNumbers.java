package com.sudha.Numberprograms;

import java.util.Scanner;

public class AlternatePrimeNumbers {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		System.out.println("Enter second value");
		int b=scn.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			if(i<=1)continue;
			if(prime(i)) {
				if(count%2==0)
				System.out.println(i);
				count++;
			}
		}
	}
	
	public static boolean prime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
