package com.bridgelabz.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.bridgelabz.utility.IOUtility;


public class PatternProgramIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		IOUtility utility = new IOUtility();
		File file=new File("/home/slot2/eclipse-workspace/BridgelabzSectionC2/src/com/bridgelabz/files/patterninput.txt");
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		String alphabet = bufferedReader.readLine();
		bufferedReader.close();
		
		
		switch (alphabet) {
		case "k":
			utility.printKPattern();
			break;
		case "d":
			utility.printDPattern();
			break;
		case "w":
			utility.printWPattern();
			break;
		
		}
	
	}

}
