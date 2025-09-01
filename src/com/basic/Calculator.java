package com.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your values");
		Scanner s = new Scanner(System.in);
		String input=s.nextLine();
		int pre=0;

		System.out.println("Entered value :"+input);
		for(int i=0;i<input.length()-2;i=i+2) {
			int a = Character.getNumericValue(input.charAt(i));
			char op = input.charAt(i+1);
			int b =Character.getNumericValue(input.charAt(i+2));
			if(op=='+') {
				if(pre==0)
					pre=Add(a,b);
				else
					pre=Add(pre,b);
				
				System.out.println(pre);
			}
			if(op=='-') {
				if(pre==0)
					pre=Sub(a,b);
				else
					pre=Sub(pre,b);
				
				System.out.println(pre);
			}
			if(op=='*') {
				if(pre==0)
					pre=Mul(a,b);
				else
					pre=Mul(pre,b);
				
				System.out.println(pre);	
			}
			if(op=='/') {
				if(pre==0)
					pre=Div(a,b);
				else
					pre=Div(pre,b);
				
				System.out.println(pre);
			}
		}
	}
	public static int Add(int a,int b) {
		System.out.println(" -> "+ a+" + "+b);
		return a+b;
	}
	public static int Sub(int a,int b) {
		System.out.println(" -> "+ a+" - "+b);
		return a-b;
	}
	public static int Mul(int a,int b) {
		System.out.println(" -> "+ a+" * "+b);
		return a*b;
	}
	public static int Div(int a,int b) {
		System.out.println(" -> "+ a+" / "+b);
		return a/b;
	}

}
