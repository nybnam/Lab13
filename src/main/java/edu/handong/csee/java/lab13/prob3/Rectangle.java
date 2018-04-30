package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {
	private double length; // variable to save length
	private double width;  // variable to save width
	public Rectangle(double length, double width) {
		this.length = length; // set double to length
		this.width = width;	// set double to width
	}
	public double area() {
		return length * width; // calculate rectangle's area(length * width)
	}
	public double perimeter() {
		return 2*(length+width); // calculate rectangle's perimeter(2*(length+width))
	}
	public double get_Length() {
		return length; // return length value
	}
	public double get_Width() {
		return width; // return width value
	}
}
