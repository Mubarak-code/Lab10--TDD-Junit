package com.example.ArrayFlattener;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class MockArrayReversor {
	private ArrayReversor arrayReverse;
	private ArrayFlattenerService flattenerService;
	
	@Before
	public void setUp() throws Exception {
		arrayReverse = new ArrayReversor();
		flattenerService = mock(ArrayFlattenerService.class);
	}

	@After
	public void tearDown() throws Exception {
		arrayReverse = null;
		flattenerService = null;
	}

	@Test
	public void test() {
	    int[][] input = {{1,2}, {3}, {4,5,7}};
		when(flattenerService.flattenArray(input)).thenReturn(new int[] {1,2,3,4,5,7});
		int[] expected = {7,5,4,3,2,1}; 
		int [] actual = arrayReverse.arrayReversor(flattenerService.flattenArray(input));
		assertArrayEquals(expected, actual);
		verify(flattenerService).flattenArray(input);
	}

}
