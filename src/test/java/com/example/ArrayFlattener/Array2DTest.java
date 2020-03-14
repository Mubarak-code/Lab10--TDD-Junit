package com.example.ArrayFlattener;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Array2DTest {
	
	private static ArrayFlattener arrayFlattener;
	@BeforeAll
	public  static void setUp() throws Exception {
		
		arrayFlattener = new ArrayFlattener();
	}

	@AfterAll
	public static void tearDown() throws Exception {
		arrayFlattener = null;
	}

	
	@org.junit.jupiter.api.Test
	public void test() {
		int[][] input = {{1,3}, {0}, {4,5,9}};
		int[] actual = arrayFlattener.flattenArray(input);
		int[] expected = {1,3,0,4,5,9};
		assertArrayEquals(expected, actual);
	}

	
	
}
   