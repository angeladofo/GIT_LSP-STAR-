package org.howard.edu.lsp.midterm.question2;

public interface Range {
	
	/**
	 * Returns true when the range contains the val
	 * @param value t
	 * @return true when value is within range
	 */
	boolean contains(int value);
	
	/**
	 * Returns true when the range overlaps with another
	 * @param other range checking for overlap
	 * @return true when there is overlap
	 */
	boolean overlaps(Range other);

	int size();
	
}

/*
 * Implementing range interface	 
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;
    
    
    /**
     * Constructs an IntegerRange with the lower and upper bounds.
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range 
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    
    
}


