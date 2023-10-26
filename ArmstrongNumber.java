package com.sudha.Numberprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Value");
		int n=scn.nextInt();
		 int temp=n;
		 int count=0;
		 while(n>0)
		 {
			 count++;
			 n=n/10;
		 }
		 n=temp;
		 int sum=0;
		 while(n>0)
		 {
			 int r=n%10;
			 int product=1;
			 for(int i=1;i<=count;i++)
			 {
				 product=product*r;
			 }
			 n=n/10;
			 sum=sum+product;
		 }
		 if(sum==temp)System.out.println("Is a ArmstrongNumber");
		 else System.out.println("Is not a ArmstrongNumber");
	}

}
