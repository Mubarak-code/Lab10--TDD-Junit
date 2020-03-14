package com.example.ArrayFlattener;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NullTester2D {
	
	
	private ArrayFlattener arrayFlattener;
	
	@Before
	public void setUp() throws Exception {
		arrayFlattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		arrayFlattener = null;
	}

	@Test
	public void test() {
		int[][] arrayInput = null;
		int[] actual = arrayFlattener.flattenArray(arrayInput);
		int[] expected = null;
		assertArrayEquals(expected, actual);
	}

}
