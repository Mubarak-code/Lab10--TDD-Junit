package com.example.ArrayFlattener;

public class ArrayReversor {
	
	public int [] arrayReversor( int[] arr ) {
		
		if(arr == null) return null; 
		
		int [] newArray = new int [arr.length];
		int counter = 0;
		
		for (int i = arr.length - 1 ; i >= 0 ; i--) {
			
			newArray[counter] = arr[i];
			
			counter++;
		}
		
		
		return newArray;
	}

}
