package com.sudha.Numberprograms;

import java.util.Scanner;

public class PalindromeSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			int m=i;
			int sum=0;
			for(;m>0;m/=10)
			{	
				sum=sum*10+i%10;
			}	
			if(sum==i) System.out.println(i);
		}
			
	}

}
