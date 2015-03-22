package bounded;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

import stringBag.StringBag;
import exceptions.FullBagException;

public interface BoundedStringBag extends StringBag {
	void insert(String s) throws FullBagException;
}
