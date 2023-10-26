package com.sudha.Numberprograms;

import java.util.Scanner;

public class PrimeUpperToLower {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter upper value");
		int a=scn.nextInt();
		System.out.println("Enter lower value");
		int b=scn.nextInt();
		
		for(int i=a;i>=b;i--) {
			if(i<=1) continue;
			int range=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					range=range+1;
					break;
				}
			}
			if(range==0) System.out.println(i);
		}
	}

}
