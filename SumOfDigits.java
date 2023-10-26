package com.sudha.Numberprograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Starting Value");
		int a=scn.nextInt();
		System.out.println("Enter Ending Value");
		int b=scn.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) sum=sum+i;
		System.out.println(sum);
	}

}
