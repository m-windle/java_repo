package bounded;

/****************************************
 * 		Author: Masatoshi Windle		*
 * 				100913032				*
 ***************************************/

import java.util.Arrays;
import java.util.Random;

import exceptions.EmptyBagException;
import exceptions.FullBagException;

public class ArrayStringBag implements BoundedStringBag {
	private String name = "";
	private String[] boundBag = null;
	private int size = 0;
	private int nextIndex = 0;
	
	public ArrayStringBag(String name, int size) {
		super();
		this.size = size;
		this.name = name;
		this.boundBag = new String[size];
	}

	@Override  
	public String remove() throws EmptyBagException {
		Random rand = new Random();
		int randIndex = 0;
				
		if(!isEmpty()){
			randIndex = rand.nextInt(this.nextIndex);
			String randString = this.boundBag[randIndex];
			
			for(int i = randIndex; i < this.size; i++){
				if(i+1 != this.size)
					this.boundBag[i] = this.boundBag[i+1];
			}
			
			--this.nextIndex;
			return randString;
		}
		else
			throw new EmptyBagException("The bag is empty. Can't remove strings.");
	}

	@Override  
	public String getName() {
		return this.name;
	}

	@Override  
	public boolean isEmpty() {
		return (this.nextIndex <= 0);
	}

	@Override  
	public void insert(String s) throws FullBagException {
		if(this.nextIndex != this.size){
			this.boundBag[this.nextIndex] = s;
			this.nextIndex++;
		}
		else
			throw new FullBagException("Bag is full. Could not add all strings.");
	}

	@Override  
	public String toString() {
		String values = ""; 
		for(int i = 0; i < this.nextIndex; i++){
			values += this.boundBag[i] + "\n";
		}
		return "=============================\n" 
				+ "The bag " + this.getName() + " contains the following:\n"
				+ "=============================\n"
				+ values;
	}
}
