package com.sudha.Numberprograms;

import java.util.Scanner;

public class NumberProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		System.out.println("rev="+rev);
		
		int sum=0;
		while(rev>0) {
			if(rev>0&&rev<1000)	sum=sum+rev%10;
			rev/=10;
		}
		System.out.println("sum="+sum);
		
		int total=0;
		do {
			total=0;
			while(sum>0) {
				total=total+sum%10;
				sum/=10;
			}	
			
		}while(n>9);
		System.out.println("total="+total);
	}	

}
