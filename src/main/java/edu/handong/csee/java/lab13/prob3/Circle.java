package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {
	private double radius; // variable to contain radius
	public Circle(double r) {
		radius = r;		// set r to radius
	}
	public double area() {
		return Math.PI * Math.pow(radius, 2); // calculate circle's area (pi * r * r)
	}
	public double perimeter() {
		return 2.0 * Math.PI * radius; // calculate circle's perimeter (2 * pi * radius)
	}
	public double get_Radius() {
		return radius; // return radius
	}
}
