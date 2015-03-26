package stringBag;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

import java.util.Scanner;

import bounded.ArrayStringBag;
import unbounded.LinkedStringBag;

public class TestStringBag {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = choice(input);
		if(choice == 1)
			boundedBag(input);
		else
			unBoundedBag(input);		
	}
	
	/*
	* Returns the integer that the user selected
	*/ 
	public static int choice(Scanner input){
		int choice = 0;
		System.out.println("Chose the StringBag type (1=Bounded, 2=Unbounded)");
		
		while(true){
			try{
				choice = input.nextInt();
				if(choice == 1 || choice == 2)
					break;
				else
					System.out.println("Invalid entry\n"
							+ "Chose the StringBag type (1=Bounded, 2=Unbounded)");
			}
			catch(Exception e){
				System.out.println("Invalid entry");
				System.out.println("Chose the StringBag type (1=Bounded, 2=Unbounded)");
				input.next();
				continue;
			}
		}
				
		return choice;		
	}

	/*
	 * BOUNDED ArrayStringBag
	 */
	public static void boundedBag(Scanner input){
		String name; int size; 
		
		System.out.println("Enter the bag name: ");
		name = input.next();
		System.out.println("Enter the bag size: ");
		while(true){
			try{
				size = input.nextInt();
				if(size > 0)
					break;
				else
					System.out.println("Invalid entry\n"
							+ "Enter the bag size: ");
			}
			catch(Exception e){
				System.out.println("Invalid entry");
				System.out.println("Enter the bag size: ");
				input.next();
				continue;
			}
		}
		
		ArrayStringBag names = new ArrayStringBag(name, size);
		
		System.out.println("Enter the desired strings (XXX to stop input): ");
		String strInput = input.next();
		while(!strInput.equals("XXX")){
			try{
				names.insert(strInput);
				strInput = input.next();
			}catch(Exception e){
				System.out.println("ERROR: " + e.getMessage());
				break;
			}
		}
		
		System.out.println(names.toString());
		
		try{
			System.out.println("=============================\n"
					+ "Picked and removed at random the string "
					+ names.remove()
					+ "\n=============================");
		}catch(Exception e){
			System.out.println("ERROR: " + e.getMessage());
		}
		
		System.out.println(names.toString());
	}
	
	/*
	 * UNBOUNDED LinkedStringBag
	 */
	public static void unBoundedBag(Scanner input){
		String name;
		
		System.out.println("Please enter a name for this bag: ");
		name = input.next();
		
		LinkedStringBag names = new LinkedStringBag(name);
		
		System.out.println("Enter the desired strings (XXX to stop input): ");
		String strInput = input.next();
		while(!strInput.equals("XXX")){
			names.insert(strInput);
			strInput = input.next();
		}
				
		System.out.println(names.toString() + "\n");
		
		try{
			System.out.println("=============================\n"
					+ "Picked and removed at random the string "
					+ names.remove()
					+ "\n=============================");
		}catch(Exception e){
			System.out.println("ERRORS: " + e.getMessage());
		}
				
		System.out.println(names.toString() + "\n");
	}
}
