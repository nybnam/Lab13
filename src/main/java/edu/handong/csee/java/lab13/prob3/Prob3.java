package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		double n1, n2;	// variables 
		Scanner keyboard = new Scanner(System.in); // instantiate input scanner

		System.out.print("Enter radius: "); // print
		n1 = keyboard.nextDouble(); // get double to keyboard
		Circle c1 = new Circle(n1); // set double to circle's radius

		System.out.println("Radius: "+ c1.get_Radius()); // print radius
		c1.display(); // print circle's value

		System.out.print("Enter length and width: "); // print
		n1 = keyboard.nextDouble(); // get double to keyboard
		n2 = keyboard.nextDouble(); // get double to keyboard
		Rectangle r1 = new Rectangle(n1, n2); // set double to rectangle's length and width

		System.out.println("Length: "+ r1.get_Length()); // print length
		System.out.println("Width: "+ r1.get_Width()); // print width
		r1.display();	// print rectangle's value
	}
}
