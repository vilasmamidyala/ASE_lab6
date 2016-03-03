package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestWeight {

	
	WeightChecker wc = new WeightChecker();
	Double ps= wc.weightc(1.0);
	Double testweight =  3.2;
	DecimalFormat f = new DecimalFormat("##.00");
	String tweight = f.format(ps);
	Double cps = Double.parseDouble(tweight);

	
	@Test
	public void testweight() {
		System.out.println("@Test weight(): " + testweight + " = " + cps);
		assertEquals(testweight,cps);
	}


	
}
