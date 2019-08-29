package com.bridgelabz.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinMaxIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = {1,2,3,4,5,9,8,7,6};
		
		
		int min = numArr[0];
		int max = numArr[0];
		for (int i = 0; i < numArr.length; i++) {
			if (min < numArr[i]) {
				min = numArr[i];
			}
			if (max > numArr[i]) {
				max = numArr[i];
			}
		}
		String minmax = "Max is :" + max + " and Min is :" + min;
		System.out.println(minmax);
		try {
			File file=new File("/home/slot2/eclipse-workspace/BridgelabzSectionC2/src/com/bridgelabz/files/minmax.txt");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(minmax);
			bufferedWriter.close();
			System.out.println("Write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
