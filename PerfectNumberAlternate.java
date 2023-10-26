package com.sudha.Numberprograms;

import java.util.Scanner;

public class PerfectNumberAlternate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Starting value");
		int a=scn.nextInt();
		System.out.println("Enter Ending value");
		int b=scn.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0) sum=sum+j;
			}
			if(sum==i) {
				count++;
				if(count%3!=0) System.out.println(i);
			}
			
			
		}
	}

}
