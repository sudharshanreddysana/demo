package com.sudha.Numberprograms;

import java.util.Scanner;

public class Niven_HarsadNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int m=n;
		int sum=0;
		while(m>0) {
			sum+=m%10;
			m/=10;
		}
		if(n%sum==0)System.out.println("Is a NivenNumber");
		else System.out.println("Is not a NivenNumber");

	}

}
