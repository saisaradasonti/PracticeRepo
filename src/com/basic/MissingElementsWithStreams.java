package com.basic;

import java.util.*;
import java.util.stream.*;
public class MissingElementsWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ele = { 1,2,3,2,4,2,3,5,2,3,7,2,4,8,5};
	   Set<Integer> str=Arrays.stream(ele).boxed().collect(Collectors.toSet());
	   List<Integer> lis= IntStream.rangeClosed(1, 9).filter(i -> !str.contains(i))
	   .boxed()
	   .toList();
	   
	   System.out.println(lis);
	   lis.forEach(i -> System.out.println(i));
	   
	 
		
		

	}

}
