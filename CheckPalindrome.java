package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int m=n;
		int sum=0;
		for(;n>0;n/=10) sum=sum*10+n%10;
		if(sum==m)System.out.println("Is a Palindrome");
		else System.out.println("Is Not a Palindrome");

	}

}
