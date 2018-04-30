package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	private String publisher; // variable to save publisher's name
	public Science(String Name, String Publisher) {
		super(Name); // call super class' constructor
		this.publisher = Publisher; // set string to publisher
	}
	public String toString() {
		return super.toString() + "\n\tPublisher: " + publisher;  // make string adding publisher to class book's toString
	}
	public void show() {
		System.out.println("<<<Science>>>" + this.toString()); // print saved string
	}
}
