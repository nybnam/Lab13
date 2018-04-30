package edu.handong.csee.java.lab13.prob6;

public class Prob6 {
	public static void main(String[] args) {
		UpPoint p1 = new UpPoint(3,3); // instantiate UpPoint
		DownPoint p2 = new DownPoint(2,5);  // instantiate DownPoint
		DownPoint p3 = new DownPoint(4,7);  // instantiate DownPoint
		UpPoint p4 = new UpPoint(9,12);  // instantiate UpPoint
		Printer.print(p1); // print value
		Printer.print(p2); // print value
		Printer.print(p3); // print value
		Printer.print(p4); // print value
	}
}
