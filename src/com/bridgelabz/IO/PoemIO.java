package com.bridgelabz.IO;

import java.io.FileNotFoundException;
import java.util.Scanner;


import com.bridgelabz.utility.UtilityIO;

public class PoemIO {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		char userinput;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please select menu");
		System.out.println("a. Chicks ­ chick\n"
				+ "b. Duck ­ quack\n"
				+ "c. Turkey ­ gobble\n"
				+ "d. Pig ­ oink, oink\n"
				+ "e. Cow ­ moo, moo\n"
				+ "f. Cat ­meow, meow\n"
				+ "g. Mule ­ Heehaw\n" 
				+ "h. Dog ­ bow wow\n" 
				+ "i. Turtle ­ nerp, nerp\n"
				);
		userinput=scanner.next().charAt(0);
		switch (userinput) {
		case 'a':
			UtilityIO.poem("Chicks", "chick");
			break;
		case 'b':
			UtilityIO.poem("Duck", "quack");
			break;
		case 'c':
			UtilityIO.poem("Turkey", "gobble");
			break;
		case 'd':
			UtilityIO.poem("Pig", "oink");
			break;
		case 'e':
			UtilityIO.poem("Cow", "moo");
			break;
		case 'f':
			UtilityIO.poem("Cat", "meow");
			break;
		case 'g':
			UtilityIO.poem("Mule", "Heehaw");
			break;
		case 'h':
			UtilityIO.poem("Dog", "bow");
			break;
		case 'i':
			UtilityIO.poem("Turtle", "nerp");
			break;
		default:
			System.out.println("Select proper input");
			break;
		}
		scanner.close();

	}

}
