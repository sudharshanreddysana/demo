package com.sudha.Numberprograms;

import java.util.Scanner;

public class LeapYearSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter start Year");
		int a=scn.nextInt();
		System.out.println("Enter end Year");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%400==0||(i%4==0&&i%100!=0))
				System.out.println(i);
		}

	}

}
