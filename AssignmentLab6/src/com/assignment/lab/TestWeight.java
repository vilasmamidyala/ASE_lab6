package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWeight {

	WeightChecker wc = new WeightChecker();
	int cm=(int) wc.weightc(1.0);
	int testweight = (int) 2.20462;

	
	@Test
	public void testweight() {
		System.out.println("@Test weight(): " + testweight + " = " + cm);
		assertEquals(cm, testweight);
	}


	
}
