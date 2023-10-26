package com.sudha.Numberprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter rev value");
		int n=scn.nextInt();
		int rev=0;
		for(;n>0;n/=10) rev=rev*10+n%10;
		System.out.println(rev);
	}

}
