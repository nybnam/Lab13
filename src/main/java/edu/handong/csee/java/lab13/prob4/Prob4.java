package edu.handong.csee.java.lab13.prob4;
import java.util.Scanner;

public class Prob4 {
	public void feed(Pet pet) {
		System.out.println("feed: " + pet.food());
	}
	
	public static void main(String[] args) {
		String cat_name, dog_name; // variable to save cat and dog's name

		Prob4 master = new Prob4(); // instantiate Prob4
		Cat cat = new Cat(); // instantiate Cat
		Dog dog = new Dog(); // instantiate Dog

		Scanner keyboard = new Scanner(System.in); // instantiate input scanner
		System.out.print("Enter the cat name and dog name: "); // print
		cat_name = keyboard.next(); // get string from keyboard
		dog_name = keyboard.next(); // get string from keyboard

		cat.setName(cat_name); // set cat's name to string
		cat.getName(); // print cat's name
		master.feed(cat); // print what we should feed

		dog.setName(dog_name); // set dog's name to string
		dog.getName(); // print dog's name
		master.feed(dog); // print what we should feed
	}
		
}
