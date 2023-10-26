package com.sudha.Numberprograms;

import java.util.Scanner;

public class EligibleForVoting {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=scn.nextInt();
		if(age>=18) System.out.println("Eligible for voting");
		else System.out.println("Not Eligible for voting");

	}

}
class EligibleMarriage
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter boy Age");
		int boy=scn.nextInt();
		System.out.println("Enter girl Age");
		int girl=scn.nextInt();
		if(boy>=21&&girl>=21) System.out.println("Eligible for marriage");
		else System.out.println("Not Eligible for marriage");
	}
}
