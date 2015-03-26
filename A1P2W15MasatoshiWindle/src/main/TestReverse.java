package main;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

import java.util.Scanner;

import iterative.Iteration;
import recursive.Recursive;

public class TestReverse {

	public static void main(String[] args) {
		String testString = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the string you wish to test");
		testString = input.nextLine();
		String cleanString = removeInvalid(testString.toLowerCase());
		
		while(cleanString.length() <= 0){
			System.out.println("Invalid!\nPlease enter the string you wish to test");
			testString = input.nextLine();
			cleanString = removeInvalid(testString.toLowerCase());
		}
		
		System.out.println("Recursively, " + testString 
				+ ((Recursive.is_pali_rec(cleanString, 0, true)) ? " is " : " isn't " ) 
				+ "a palindrome.");
		
		System.out.println("Iteratively, " + testString
				+ ((Iteration.is_pali_it(cleanString)) ? " is " : " isn't ")
				+ "a palindrome.");
	}
	
	/* 
	* Removes characters that are not letters of the alphabet
	*/
	public static String removeInvalid(String input){
		input = input.toLowerCase();
		String[] invalidChars = {"-", ".", "\'", ",", "?", "!", ":", ";", "\"", " "};
		
		for(int i = 0; i < invalidChars.length; i++)
			input = input.replace(invalidChars[i], "");
		
		return input;
	}

}
