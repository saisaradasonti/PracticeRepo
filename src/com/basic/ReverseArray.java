package com.basic;

import java.util.*;
import java.util.stream.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before");
		int[] arr= {1 ,2, 3, 4, 5};
		int start=0;
		int end = arr.length-1;
		Arrays.stream(arr).forEach(i -> System.out.println(i));
		
		while(start < end) {
			int temp =arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("After : ");
		Arrays.stream(arr).forEach(i -> System.out.println(i));
	}
	

}
