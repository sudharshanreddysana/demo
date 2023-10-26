package com.sudha.Numberprograms;

import java.util.Scanner;

public class UntilSinDigDoWhile {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scn.nextInt();
		do{
			int sum=0;
			while(n>0) {
				sum=sum+n%10;
				n/=10;
			}
			 n=sum;
		}while(n>9);
		System.out.println(n);

	}

}
