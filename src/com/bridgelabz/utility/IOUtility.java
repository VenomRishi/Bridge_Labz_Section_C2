/******************************************************************************
 *  Purpose: This is utility file which contains logic of all programs.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   29-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.*;

public class IOUtility {
	
	public static void poem(String animal, String sound) throws FileNotFoundException {
		File file=new File("/home/slot2/eclipse-workspace/BridgelabzSectionC2/src/com/bridgelabz/files/poem.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		try {
			str = bufferedReader.readLine();
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String replaceString = str.replaceAll("ANIMAL", animal);
		String replaceString2 = replaceString.replaceAll("SOUND", sound);

		System.out.println(replaceString2);
		System.out.println("Writing in file of same");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(replaceString2);
			bufferedWriter.close();
			System.out.println("Write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void printKPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 13; j++) {
				if (i == 1) {
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");

				}
				if (i == 2) {
					if (j > 2 && j <= 8)
						System.out.print(" ");
//					else if (j > 9 && j <= 11)
//						System.out.print("*");
					else if (j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 3) {
					if (j > 2 && j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 9)
						System.out.print("*");
					else if (j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 4) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 7)
						System.out.print("*");
					else if (j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 5) {
					if (j > 5 && j <= 13)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 6) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 7)
						System.out.print("*");
					else if (j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 7) {
					if (j > 2 && j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 9)
						System.out.print("*");
					else if (j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 8) {
					if (j > 2 && j <= 8)
						System.out.print(" ");
					else if (j > 9 && j <= 11)
						System.out.print("*");
					else if (j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 9) {
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");
				}

			}
			System.out.println();
		}

	}

	public void printDPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 15; j++) {
				switch (i) {
				case 1:
					if (j > 10 && j <= 15)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 2:
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 3:
					if (j > 2 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 4:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 5:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 6:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 7:
					if (j > 2 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 8:
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 9:
					if (j > 10 && j <= 15)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				}
			}
			System.out.println();
		}

	}

	public void printWPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 32; j++) {
				switch (i) {
				case 1:
					if (j > 2 && j <= 15)
						System.out.print(" ");
					else if (j == 16)
						System.out.print("*");
					else if (j > 16 && j <= 29)
						System.out.print(" ");
					else if (j > 29 && j <= 31)
						System.out.print("*");
					else if (j == 32)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 2:
					if (j == 1)
						System.out.print(" ");
					else if (j > 1 && j <= 3)
						System.out.print("*");
					else if (j > 3 && j <= 14)
						System.out.print(" ");
					else if (j > 14 && j <= 17)
						System.out.print("*");
					else if (j > 17 && j <= 28)
						System.out.print(" ");
					else if (j > 28 && j <= 30)
						System.out.print("*");
					else if (j > 30)
						System.out.print(" ");
					else
						System.out.print("*");

					break;
				case 3:
					if (j <= 2)
						System.out.print(" ");
					else if (j > 2 && j <= 4)
						System.out.print("*");
					else if (j > 4 && j <= 13)
						System.out.print(" ");
					else if (j > 13 && j <= 15)
						System.out.print("*");
					else if (j == 16)
						System.out.print(" ");
					else if (j > 16 && j <= 18)
						System.out.print("*");
					else if (j > 18 && j <= 27)
						System.out.print(" ");
					else if (j > 27 && j <= 29)
						System.out.print("*");
					else if (j > 29)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 4:
					if (j <= 3)
						System.out.print(" ");
					else if (j > 3 && j <= 5)
						System.out.print("*");
					else if (j > 5 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 14)
						System.out.print("*");
					else if (j > 14 && j <= 17)
						System.out.print(" ");
					else if (j > 17 && j <= 19)
						System.out.print("*");
					else if (j > 19 && j <= 26)
						System.out.print(" ");
					else if (j > 26 && j <= 28)
						System.out.print("*");
					else if (j > 28)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 5:
					if (j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 6)
						System.out.print("*");
					else if (j > 6 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13 && j <= 18)
						System.out.print(" ");
					else if (j > 18 && j <= 20)
						System.out.print("*");
					else if (j > 20 && j <= 25)
						System.out.print(" ");
					else if (j > 25 && j <= 27)
						System.out.print("*");
					else if (j > 27)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 6:
					if (j <= 5)
						System.out.print(" ");
					else if (j > 5 && j <= 7)
						System.out.print("*");
					else if (j > 7 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12 && j <= 19)
						System.out.print(" ");
					else if (j > 19 && j <= 21)
						System.out.print("*");
					else if (j > 21 && j <= 24)
						System.out.print(" ");
					else if (j > 24 && j <= 26)
						System.out.print("*");
					else if (j > 26)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 7:
					if (j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 8)
						System.out.print("*");
					else if (j > 8 && j <= 9)
						System.out.print(" ");
					else if (j > 9 && j <= 11)
						System.out.print("*");
					else if (j > 11 && j <= 20)
						System.out.print(" ");
					else if (j > 20 && j <= 22)
						System.out.print("*");
					else if (j > 22 && j <= 23)
						System.out.print(" ");
					else if (j > 23 && j <= 25)
						System.out.print("*");
					else if (j > 25)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 8:
					if (j <= 7)
						System.out.print(" ");
					else if (j > 7 && j <= 10)
						System.out.print("*");
					else if (j > 10 && j <= 21)
						System.out.print(" ");
					else if (j > 21 && j <= 24)
						System.out.print("*");
					else if (j > 24)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 9:
					if (j <= 8)
						System.out.print(" ");
					else if (j == 9)
						System.out.print("*");
					else if (j > 9 && j <= 22)
						System.out.print(" ");
					else if (j == 23)
						System.out.print("*");
					else if (j > 23)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				}
			}
			System.out.println();
		}

	}
}
