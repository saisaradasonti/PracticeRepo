package com.basic;

import java.util.Scanner;
/*
 * Read and write from console
 */
public class ReadandWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter Name :");
		Scanner s = new Scanner(System.in);
		String name=s.next();
		System.out.println("Welcome "+name+" to the Java World !\n");
		System.out.println(" Enter Your Thoughts :");
		String input=s.nextLine();
		System.out.println("Hey "+name+" here are your thoughts : "+s.nextLine());
		s.close();

	}

}
