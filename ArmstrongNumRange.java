package com.sudha.Numberprograms;

import java.util.Scanner;

public class ArmstrongNumRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			int m=i;
			int length=0;
			while(m>0) {
				length++;
				m/=10;
			}
			int k=i;
			int sum=0;
			while(k>0) {
				int rem=k%10;
				int tot=1;
				for(int j=1;j<=length;j++) {
					tot=tot*rem;
				}
				sum=sum+tot;
				k/=10;
			}
			if(sum==i)System.out.println(i);
		}

	}

}
