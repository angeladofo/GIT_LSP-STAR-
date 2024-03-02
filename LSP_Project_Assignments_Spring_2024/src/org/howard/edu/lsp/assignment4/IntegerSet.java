

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
		set.clear();
	};
	
	// Returns the length of the set
    public int length() {
        return set.size();
    }

    // Returns the largest item in the set; Throws an IntegerSetException if the set is empty
    public int largest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return set.stream().max(Integer::compare).orElseThrow();
    }

    // Returns the smallest item in the set; Throws an IntegerSetException if the set is empty
    public int smallest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return set.stream().min(Integer::compare).orElseThrow();
    }
    
    // Adds an item to the set or does nothing if already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }
    
    // Set union
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    // Set intersection, all elements in s1 and s2
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }
    
    // Set difference, i.e., s1 - s2
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1
    public void complement(IntegerSet intSetb) {
        IntegerSet tempSet = new IntegerSet(new ArrayList<>(intSetb.set));
        tempSet.diff(this);
        set = tempSet.set;
    }

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set.
    @Override
    public String toString() {
        return set.toString();
    }
    
    public static class IntegerSetException extends RuntimeException {
        public IntegerSetException(String message) {
            super(message);
        }
    }



}
