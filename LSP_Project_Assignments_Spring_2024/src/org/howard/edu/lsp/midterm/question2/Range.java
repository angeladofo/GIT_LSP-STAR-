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
    @Override
    public boolean contains(int value) {
    	return value >= lowerBound && value <= upperBound;
    	}
    
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return this.contains(otherRange.lowerBound) || this.contains(otherRange.upperBound) ||
                   otherRange.contains(this.lowerBound) || otherRange.contains(this.upperBound);
        }
        return false;
    }
    
    public int size() {
    	return Math.abs(upperBound - lowerBound) + 1;
    }
    public boolean equals(Object obj) {
    
    	if (this == obj) return true;
    	if (!(obj instanceof IntegerRange)) return false;
    	IntegerRange other = (IntegerRange) obj;
    	return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
		}

}
