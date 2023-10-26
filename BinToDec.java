package com.sudha.Numberprograms;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter bin value");
		int a=scn.nextInt();
		
		int i=1;
		int dec=0;
		while(a>0)
		{
			int r=a%10;
			dec=dec+r*i;
			i=i*2;
			a=a/10;
		}
		System.out.println(dec);

	}

}
