package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		
		int m=n;
		int length=0;
		while(n>0) {
			length++;
			n/=10;
		}
		n=m;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int tot=1;
			for(int i=1;i<=length;i++) {
				tot=tot*rem;
			}
			sum=sum+tot;
			n/=10;
		}
		if(sum==m)System.out.println("Is a Armstrong Number");
		else System.out.println("Is Not a Armstrong Number");
	}

}
