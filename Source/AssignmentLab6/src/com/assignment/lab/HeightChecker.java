package com.assignment.lab;

public class HeightChecker {

public double heightc(double feet, double inch) {
	double feet2 =  (feet * 30.48);
	double inch2 =  (inch * 2.54);
	System.out.println("values: " +feet2  + " + " + inch2);
	return feet2 + inch2;
}
}
