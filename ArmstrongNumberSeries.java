package com.sudha.Numberprograms;

import java.util.Scanner;

public class ArmstrongNumberSeries {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting value");
		int a=scn.nextInt();
		System.out.println("Enter ending value");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			int n=i;
			int count=0;
			while(n>0) {
				count++;
				n/=10;
			}
			n=i;
			int sum=0;
			while(n>0) {
				int rem=n%10;
				int product=1;
				for(int j=1;j<=count;j++)
				{
					product=product*rem;
				}
				n=n/10;
				sum=sum+product;
			}
			if(sum==i)System.out.println(i);
		}
	}
}
