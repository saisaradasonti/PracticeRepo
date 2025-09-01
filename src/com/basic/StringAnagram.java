package com.basic;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		String str1="Hello";
		String str2="Hello";
		
		if(Anagram(str1,str2)) {
			System.out.println("Both are equals");
		}
		else {
			System.out.println("Both are not Equals");
		}
		
	}
	public static Boolean Anagram(String str,String str1) {
		
		str = str.replaceAll("\\s", "").toLowerCase();
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		
		if (str.length()!=str1.length()) {
			return false;
		}
		
		char[] charArr1 = str.toCharArray();
		char[] charArr2 = str1.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		return Arrays.equals(charArr1, charArr2);
	}
}
