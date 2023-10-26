package com.sudha.Numberprograms;

import java.util.Scanner;

public class RangeDecToBin {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting value");
		int a=scn.nextInt();
		System.out.println("Enter ending value");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int c=i;
			int j=1;
			int bin=0;
			for(;c>0;c/=2)
			{
				int rem=c%2;
				bin=bin+rem*j;
				j*=10;
			}
			System.out.println(bin);
		}
		

	}

}
