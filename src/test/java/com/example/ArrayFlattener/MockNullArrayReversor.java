package com.example.ArrayFlattener;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class MockNullArrayReversor {
	private ArrayReversor arrayReversor;
	private ArrayFlattenerService flattenerService;
	
	
	@Before
	public void setUp() throws Exception {
		arrayReversor = new ArrayReversor();
		flattenerService = mock(ArrayFlattenerService.class);
	}

	@After
	public void tearDown() throws Exception {
		arrayReversor = null;
		flattenerService = null;
	}

	@Test
	public void test() {
	    int[][] input = null;
		when(flattenerService.flattenArray(input)).thenReturn(null);
		int[] expected = null;
		int[] actual = arrayReversor.arrayReversor(flattenerService.flattenArray(input));
		assertArrayEquals(expected, actual);
		verify(flattenerService).flattenArray(input);
	}
}
