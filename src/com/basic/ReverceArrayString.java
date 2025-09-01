package com.basic;

import java.util.Arrays;

public class ReverceArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before");
		String[] arr = {"Apple","ball"};
		Arrays.stream(arr).forEach( i -> System.out.println(i));
		int start=0,end=arr.length-1 ;
		while(start < end) {
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("After :");
		Arrays.stream(arr).forEach( i -> System.out.println(i));


	}

}
