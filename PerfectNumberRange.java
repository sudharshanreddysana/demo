package com.sudha.Numberprograms;

import java.util.Scanner;

public class PerfectNumberRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Starting Value");
		int a=scn.nextInt();
		System.out.println("Enter Ending Value");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			if(isPerfect(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) return true;
		
		return false;
	}

}
