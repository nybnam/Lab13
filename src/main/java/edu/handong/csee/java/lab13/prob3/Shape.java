package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {
	public abstract double area(); // variable to save area
	public abstract double perimeter(); // variable to save perimeter
	public void display() {
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n"); // print class' value
	}
}
