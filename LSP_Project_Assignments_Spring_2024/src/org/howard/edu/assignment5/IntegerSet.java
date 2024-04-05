

package org.howard.edu.assignment5;

import java.util.ArrayList;
import java.util.List;



public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	 /**
     * Default Constructor for an empty IntegerSet.
     */

	public IntegerSet() {

	}
	/**
	 * 
     *
     * @param set The set of integers to initialize.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	/**
	* Clears the internal representation of the set
	*/
	public void clear() {
		set.clear();
	};
	
	// Returns the length of the set
    public int length() {
        return set.size();
    }

    /** Returns the largest item in the set; Throws an IntegerSetException if the set is empty
    *
    *
    * @return the length of the set
    */
    public int largest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return set.stream().max(Integer::compare).orElseThrow();
    }
    /**
    *Returns the smallest item in the set; Throws an IntegerSetException if the set is empty
    *
    * @return the length of the set
    */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return set.stream().min(Integer::compare).orElseThrow();
    }
    /**
    * Adds an item to the set or does nothing if already there
    *
    * @param
    * @return
    */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }
    /**
    * Removes an item from the set or does nothing if not there
    *
    * @param item being removed
    *
    */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }
    
    /**
     * set union
     * @param intSetb
     */
  
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    
    /**
     * Set intersection, all elements in s1 and s2
     * 
     * @param intSetb
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }
    
    /**
     * set difference operation with another set (s1 - s2).
     *
     * @param intSetb The IntegerSet to subtract from the current set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Calculates the complement of the current set with respect to another set.
     *
     * @param intSetb complement calculation.
     */

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
    
    /**
     * Checks if the set contains a specific value.
     *
     * @param value 
     * @return true if the set contains the value, false otherwise.
     */

    public boolean contains(int value) {
        return set.contains(value);
    }
    
    public static class IntegerSetException extends RuntimeException {
        public IntegerSetException(String message) {
            super(message);
        }
    }



}
