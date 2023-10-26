package com.sudha.Numberprograms;

import java.util.Scanner;

public class OneToTen {
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) System.out.println(i);
		for(int i=n;i>=1;i--) System.out.print(i+" ");
	}
}
