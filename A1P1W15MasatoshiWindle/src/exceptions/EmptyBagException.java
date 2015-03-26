package exceptions;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

/*
* Exception thrown when bag is empty
*/
public class EmptyBagException extends Exception {
	public EmptyBagException() { }
	public EmptyBagException(String msg) { super(msg); } 
	public EmptyBagException(Throwable cause) { super(cause); }
	public EmptyBagException(String msg, Throwable cause) { super(msg, cause); }
}