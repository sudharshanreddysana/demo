package com.sudha.Numberprograms;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Dec value");
		int n=scn.nextInt();
		int i=1;
		int bin=0;
		while(n>0) {
			int rem=n%2;
			bin=rem*i+bin;
			i=i*10;
			n/=2;
		}
		System.out.println(bin);

	}

}
