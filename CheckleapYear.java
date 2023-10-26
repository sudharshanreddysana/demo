package com.sudha.Numberprograms;

import java.util.Scanner;

public class CheckleapYear {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter year");
		int y=scn.nextInt();
		if(y%400==0||(y%4==0&&y%100!=0))System.out.println("Is a Leap Year");
		else System.out.println("Is Not a Leap Year");
	}

}
