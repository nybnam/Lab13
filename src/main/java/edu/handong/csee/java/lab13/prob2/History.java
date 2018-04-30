package edu.handong.csee.java.lab13.prob2;

public class History extends Book{
	private String Author; // variable to save author's name
	public History(String Name, String Author) {
		super(Name);	// call super class' constructor
		this.Author = Author;  // set string to Author
	}
	public String toString() {
		return super.toString() + "\n\tAuthor: " + Author; // make string adding author to class book's toString
	}
	public void show() {
		System.out.println("<<<History>>>" + this.toString()); // print the string that saved
	}
}
