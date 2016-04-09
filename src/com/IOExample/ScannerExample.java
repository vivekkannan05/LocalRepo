package com.IOExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {

	 
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		 try(Scanner s= new Scanner(new BufferedReader(new FileReader("c:\\users\\vivek\\documents\\file.csv")))) {
			//s.useDelimiter(",");
			
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
				//System.out.println(s.next());
			}
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
