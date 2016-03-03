package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestHeight {

	HeightChecker hc = new HeightChecker();
	Double cm= hc.heightc(1.0,0.0);
	Double testheight =  40.48;
	DecimalFormat f = new DecimalFormat("##.00");
	String theight = f.format(cm);
	Double ccm = Double.parseDouble(theight);

	
	@Test
	public void testheight() {
		System.out.println("@Test height(): " + testheight + " = " + ccm);
		assertEquals(testheight, ccm);
	}


}
