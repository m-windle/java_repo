package iterative;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

public class Iteration {	
	public static boolean is_pali_it(String input){
		String testString = "";		
		LinkedStack<Character> testStack = new LinkedStack<Character>();
		
		for(int i = 0; i < input.length(); i++){
			testStack.push(input.charAt(i));
		}
		
		while(!testStack.isEmpty()){
			testString += testStack.top();
			testStack.pop();
		}
		
		return testString.equals(input);
	}
}
