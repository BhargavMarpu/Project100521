package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AppendToTextFile {

	public static void main(String[] args) {

		String fileName = "data\\input.txt";
		String path = System.getProperty("user.dir");
		String filePath = path+"\\"+fileName;
		String appendText = "New Line";

		try {
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));

			String tempLine;
			String output = "";
			while ((tempLine = br.readLine()) != null) {
				output += tempLine +"\n";
			}
			System.out.println(output);
			
			output += appendText;
			
			String outputFilePath = path +"\\data\\output.txt";
			System.out.println(outputFilePath);
			File outputFile = new File(outputFilePath);

			if(!outputFile.exists())
				outputFile.createNewFile();

			FileWriter fw=new FileWriter(outputFile);    
			fw.write(output);    
			fw.close();    

		}catch(Exception e) {
			System.out.println("Error in reading & writing file "+e);
		}


	}

}
