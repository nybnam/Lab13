package edu.handong.csee.java.lab13.prob5;
import java.util.Scanner;

public class Prob5 {
	
	public static boolean equals(int[][] m1, int[][] m2) {
		int count = 0; // variable to save count of difference
		if (m1.length != m2.length) 
			return false;			// if the number of row is different, return false
		for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
            {
                if (m1[i][j] != m2[i][j])
                	count++; 	// if value is not same count + 1
            }
		}
		if(count <= 3)
			return true; // if difference is lower than 3, return true
		else
			return false;  // if difference is bigger than 3, return false
	}
	
	public static void main(String[] args) {
		int n1, n2 = 0; // variables to save inputs
		
		Scanner keyboard = new Scanner(System.in); // instantiate input scanner 
		System.out.print("Enter row size(maximum 5): "); // print
		n1 = keyboard.nextInt();	// get integer from keyboard 
		System.out.print("Enter column size(maximum 5): "); // print
		n2 = keyboard.nextInt();	// get integer from keyboard
		int[][] m1 = new int[n1][n2]; // create array 
		
		System.out.print("Enter row size(maximum 5): "); // print
		n1 = keyboard.nextInt(); 	// get integer from keyboard
		System.out.print("Enter column size(maximum 5): "); // print
		n2 = keyboard.nextInt();	// get integer from keyboard
		int[][] m2 = new int[n1][n2]; // create array
		
		System.out.print("Enter List1: "); // print
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				m1[i][j] = keyboard.nextInt(); // get integer from keyboard
		
		System.out.print("Enter list2: "); // print
		 for (int i = 0; i < m2.length; i++){
		    for (int j = 0; j < m2[i].length; j++)
		                m2[i][j] = keyboard.nextInt(); 	// get integer from keyboard
		 
		    for (i = 0; i < m1.length; i++){
		    	for (int j = 0; j < m1[i].length; j++)
		    		System.out.print(m1[i][j] + " "); // print array's values
		    	System.out.println(); // line change to show m1.length
		    }
		    
		 System.out.println(); // line change
		 
		 for (i = 0; i < m2.length; i++){
		    for (int j = 0; j < m2[i].length; j++)
		      System.out.print(m2[i][j] + " "); // print array's values
		    System.out.println(); // line change to show m2.length
		 }
		 System.out.println(); // line change
		               
		     
		    if (equals(m1, m2)) 
		    	System.out.println("The two arrays are approximately identical."); // if equal return true, print "identical"
		    else 
		    	System.out.println("The two arrays are not identical");  // if equal return true, print "not identical"

		 }
	}
}

		   

