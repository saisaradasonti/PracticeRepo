package com.basic;

import java.util.HashSet;
import java.util.Scanner;

public class CheckUniqueChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String str = s.next();
		if(check(str)) {
			System.out.println("Given String "+str+" has unique charaters");
		}else {
			System.out.println("Given String "+str+" has not unique charaters");
		}
		

	}
	public static boolean check(String str) {
		HashSet<Character> hs = new HashSet<>();
		for(char c: str.toCharArray()) {
			if(!hs.add(c)) {
				return false;
			}
		}
		return true;
	}

}
