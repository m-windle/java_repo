package exceptions;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

public class FullBagException extends Exception{
	public FullBagException() { }
	public FullBagException(String msg) { super(msg); } 
	public FullBagException(Throwable cause) { super(cause); }
	public FullBagException(String msg, Throwable cause) { super(msg, cause); }
}