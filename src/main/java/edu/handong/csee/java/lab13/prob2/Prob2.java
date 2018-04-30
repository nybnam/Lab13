package edu.handong.csee.java.lab13.prob2;

public class Prob2 {
	public static void main(String[] args) {
		Book book = new Book("Simple Book"); // instantiate class book, Name
		Science science = new Science("Hello Physics!", "ScienceWorld"); // instantiate class Science, Name and Publisher
		History history1 = new History("What Is history?", "E.H.Carr" );// instantiate class History, Name and Author
		
		book.show(); // print book's value
		science.show();  // print science's value
		history1.show();  // print history's value
	}
}
