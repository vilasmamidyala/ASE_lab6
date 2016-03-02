package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHeight {

	HeightChecker hc = new HeightChecker();
	int cm=(int) hc.heightc(1.0,0.0);
	int testheight = (int) 30.48;

	
	@Test
	public void testheight() {
		System.out.println("@Test height(): " + testheight + " = " + cm);
		assertEquals(cm, testheight);
	}


}
