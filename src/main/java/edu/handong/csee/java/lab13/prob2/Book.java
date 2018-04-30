package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idCount = 0; // variable to count book
	private String BookName; // variable to contain book's name
	private int id;		// variable to contain id
	public Book(String Name) {
		this.BookName = Name; // set string to BookName
		idCount++;		// count book
		id = idCount;	// set idCount to id
	}
	public String toString() {
		return "\n\tId: " + id + "\n\tBook Name: " + BookName; // make string that have id and BookName
	}
	public void show() {
		System.out.println("<<<BOOK>>>" + this.toString()); // print string that contain id and BookName
	}
}
