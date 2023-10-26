package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		int m=n;
		
		int sum=0;
		while(n>0) {
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		if(sum==m)System.out.println("Is a StrongNumber");
		else System.out.println("Is not a StrongNumber");

	}

}
