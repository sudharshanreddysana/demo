package com.sudha.Numberprograms;

import java.util.Scanner;

public class magicNumberProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		do {
			int sum=0;
			while(n>0) {
				sum=sum+n%10;
				n/=10;
			}
			n=sum;
		}while(n>9);
		if(n==1)System.out.println("Is A Magic NUmber");
		else System.out.println("Is not a Magic Number");

	}

}
