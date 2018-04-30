package edu.handong.csee.java.lab13.prob6;

public class Printer {
	public static void print(Object object){
		String str = object.toString(); // set str to string that contain x, y and its value
		if(object instanceof CapitalPrint)
			str = str.toUpperCase();	// if object inherit capital, set string to upper case
		System.out.println(str); // print string
	}
}