package com.sudha.Numberprograms;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int sum=0;
		for(;n>0;n/=10) sum=sum+n%10;
		System.out.println(sum);
	}
}
