package com.sudha.Numberprograms;

import java.util.Scanner;

public class DoWhileLoopProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
			int sum=0;
			System.out.println(sum+"..................");
		do {
			sum=0;
			while(n>0) {
				sum=sum+n%10;
				n/=10;	
			}
			System.out.println(sum);
			n=sum;
		}while(n>9);
		System.out.println(sum);

	}

}
