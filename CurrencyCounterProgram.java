package com.sudha.Numberprograms;

import java.util.Scanner;

public class CurrencyCounterProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amt=scn.nextInt();
		
		if(amt==0) System.out.println("Invalid");
		
		if(amt>=2000) {
			System.out.println("Two Thousand Notes "+amt/2000);
			amt=amt%2000;
			}
		 if(amt>=500) {
			System.out.println("Five Hundread Notes "+amt/500);
			amt=amt%500;
		 	}
		 if(amt>=200) {
			System.out.println("Two Hundread Notes "+amt/200);
			amt=amt%200;
			}
		 if(amt>=100) {
			System.out.println("Hundread Notes "+amt/100);
			amt=amt%100;
			}
		 if(amt>=50) {
			System.out.println("Fifty Ruphees Notes "+amt/50);
			amt=amt%50;
			}
			
	}

}
