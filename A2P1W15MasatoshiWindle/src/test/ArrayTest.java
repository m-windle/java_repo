package test;
import java.util.Scanner;

import array.ArrayRefSortedStringList;

public class ArrayTest {	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String inputString;
		String testString = "";

		System.out.print("Please enter the desired list capacity: ");
		int size = CustomIO.getPosInt();
		ArrayRefSortedStringList studentList = new ArrayRefSortedStringList(size);
		do{
			System.out.print("\nPlease chose one of the following options: \n"
					+ "(A)dd, (R)emove, (D)isplay (Enter to exit): ");
			testString = sc.nextLine();
			switch(testString.toLowerCase()){
				case "a": 
					System.out.print("\nPlease enter the student name: ");
					testString = sc.nextLine();
					studentList.add(testString);
					break;
				case "r":
					System.out.print("\nPlease enter the student name: ");
					testString = sc.nextLine();
					studentList.remove(testString);
					break;
				case "d":
					System.out.print(studentList.toString());
					break;
				case "":
					System.out.println("\nThanks for using Student List");
					return;
				default:
					System.out.println("\nInvalid input");
			}
		}while(true);
	}
}
