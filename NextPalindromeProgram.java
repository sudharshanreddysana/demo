package com.sudha.Numberprograms;

import java.util.Scanner;

public class NextPalindromeProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		System.out.println("Enter second value");
		int b=scn.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			int num=i;
			int rev=0;
			while(num>0) {
				rev=rev*10+num%10;
				num/=10;
			}
			if(rev==i) {
				count++;
				if(count==2)System.out.println(i);
			}
		}

	}

}
