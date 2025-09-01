package com.basic;

public class CheckUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		String str="abcdeff";
		boolean result=false;
		char[] charArr=str.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			for(int j=i+1;j<charArr.length;j++) {
				if(charArr[i]==charArr[j]) {
					result=true;
					break;
				}
			}
		}
		System.out.println(result);

	}

}
