package com.sudha.Numberprograms;

import java.util.Scanner;

public class PrimeNumberCount {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		int count=0;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(i<=1) continue;
			int range=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					range=range+1;
					break;
				}
			}
			if(range==0) {
				count++;
				sum=sum+i;
				System.out.println(i);
			}	
		}	
		System.out.println("count= "+count);
		System.out.println("sum= "+sum);
	}

}
