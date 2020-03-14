package com.example.ArrayFlattener;


import java.util.Arrays;




/**
 * Hello world!
 *
 */
public class ArrayFlattener implements ArrayFlattenerService{
	
	public int[] flattenArray(int[][]array) {
			
//	Stream<int[]> stream = Arrays.stream(array);
		
		if (array == null) return null;
	
	 return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).toArray();
		

	}
	
	
	
}
