package stringBag;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

import exceptions.EmptyBagException;

public interface StringBag {
	String remove() throws EmptyBagException;
	String getName();
	boolean isEmpty();
}
