package edu.handong.csee.java.lab13.prob6;

public class DownPoint {
	private int x, y; // variable to save value 
	DownPoint(int x, int y){
		this.x = x; this.y = y; // set x, y to integers
	}
	public String toString() {
		return "x : " + x + " y : " + y;  // return string that contain x, y and its value
	}
}
