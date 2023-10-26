package com.sudha.Numberprograms;

import java.util.Scanner;

public class StrongNumberRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter First value");
		int a=scn.nextInt();
		System.out.println("Enter Second value");
		int b=scn.nextInt();
		int count=0;
		for(int i=a;i<=b;i++)
		{
			int n=i;
			int sum=0;
			while(n>0) {
				int r=n%10;
				int fact=1;
				for(int j=1;j<=r;j++) fact=fact*j;
				n/=10;
				sum=sum+fact;
			}
			if(sum==i) System.out.println(i);
				
		}
	}
}
