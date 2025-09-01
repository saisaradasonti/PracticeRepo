package com.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverceArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before :");
		int[] arr = {1,2,3,4,5,6};
		Arrays.stream(arr).forEach( i -> System.out.println(i));

		System.out.println(arr);
		int[] reArr = IntStream.range(0, arr.length)
		.map(i->arr[arr.length-1-i])
		.toArray();
		System.out.println("After :");
		Arrays.stream(reArr).forEach( i -> System.out.println(i));

	}

}
