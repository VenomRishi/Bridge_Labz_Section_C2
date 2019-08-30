package com.bridgelabz.IO;

import java.io.FileNotFoundException;
import java.util.Scanner;


import com.bridgelabz.utility.IOUtility;

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
			IOUtility.poem("Chicks", "chick");
			break;
		case 'b':
			IOUtility.poem("Duck", "quack");
			break;
		case 'c':
			IOUtility.poem("Turkey", "gobble");
			break;
		case 'd':
			IOUtility.poem("Pig", "oink");
			break;
		case 'e':
			IOUtility.poem("Cow", "moo");
			break;
		case 'f':
			IOUtility.poem("Cat", "meow");
			break;
		case 'g':
			IOUtility.poem("Mule", "Heehaw");
			break;
		case 'h':
			IOUtility.poem("Dog", "bow");
			break;
		case 'i':
			IOUtility.poem("Turtle", "nerp");
			break;
		default:
			System.out.println("Select proper input");
			break;
		}
		scanner.close();

	}

}
