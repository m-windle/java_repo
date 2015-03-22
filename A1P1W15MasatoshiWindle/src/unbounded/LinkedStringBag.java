package unbounded;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

import java.util.Random;
import exceptions.EmptyBagException;

public class LinkedStringBag implements UnboundedStringBag {
	private LLNode<String> linkedBag = null;
	private String name = ""; 
	private int length = 0;
	
	public LinkedStringBag(String name) {
		super();
		this.linkedBag = new LLNode<String>(null);
		this.name = name;
	}

	@Override
	public String remove() throws EmptyBagException {		
		if(!isEmpty()){
			Random rand = new Random();
			LLNode<String> firstNode = this.linkedBag;
			LLNode<String> current = this.linkedBag;
			LLNode<String> previous = null;
			String output = "";
			int steps = rand.nextInt(this.length);
		
			while(current.getInfo() != null)
			{
				if (steps == 0){
					output = current.getInfo();
					if(current == firstNode){
						this.linkedBag = current.getLink();
						--this.length;
					}
					else{
						previous.setLink(current.getLink());
						this.linkedBag = firstNode;
						--this.length;
					}
					break;
				}
				else{
					previous = current;
					current = current.getLink();
					--steps;
				}
			}
			
			return output;
		}
		else
			throw new EmptyBagException("Bag is empty. Can't remove strings.");			
	}

	@Override 
	public String getName() {
		return this.name;
	}

	@Override 
	public boolean isEmpty() {
		return (this.linkedBag.getInfo() == null);
	}

	@Override 
	public void insert(String s) {
		LLNode<String> newNode = new LLNode<String>(s);
		newNode.setLink(linkedBag);		
		linkedBag = newNode;
		this.length++;
	}

	@Override 
	public String toString() {
		LLNode<String> strings = this.linkedBag;
		String current = "";
		String output = "";
		
		while(strings.getInfo() != null)
		{
			current = strings.getInfo();
			output += current + "\n";
			strings = strings.getLink();
		}
		
		return "=============================\n" 
				+ "The bag " + this.getName() + " contains the following:\n"
				+ "=============================\n"
				+ output; 
	}
}