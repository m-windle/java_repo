package recursive;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

/*
* Recursively calls a string to test if it is a palindrome
*/
public class Recursive {	
	public static boolean is_pali_rec(String input, int index, boolean is_not){		
		if(index != (input.length() - 1) && is_not != false){
			index++;
			if(input.charAt(index) != input.charAt(input.length() - 1 - index))
				is_not = false;
			is_pali_rec(input, index, is_not);
		}		
		return is_not;
	}
}
