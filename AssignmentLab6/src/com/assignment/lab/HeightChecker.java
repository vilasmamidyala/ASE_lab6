package com.assignment.lab;

public class HeightChecker {

public int heightc(double feet, double inch) {
	int feet2 = (int) (feet * 30.48);
	int inch2 = (int) (inch * 2.54);
	System.out.println("values: " +feet2  + " + " + inch2);
	return feet2 + inch2;
}
}
