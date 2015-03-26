package exceptions;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

/*
* Exception thrown when the bag is full
*/
public class FullBagException extends Exception{
	public FullBagException() { }
	public FullBagException(String msg) { super(msg); } 
	public FullBagException(Throwable cause) { super(cause); }
	public FullBagException(String msg, Throwable cause) { super(msg, cause); }
}