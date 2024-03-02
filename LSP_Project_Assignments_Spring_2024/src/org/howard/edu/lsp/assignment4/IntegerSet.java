

package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;



public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	//Constructor
	public IntegerSet() {

	}
	//Constructor
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	// Clears the internal representation of the set
	public void clear() {
		set.clear()
	};


}
