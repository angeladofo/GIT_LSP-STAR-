package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.assignment5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.Test;


class IntegerSetTest {

	@Test
    public void testGetLength() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        set.add(10);
        set.add(3);
        assertEquals(3, set.length());
    }

	
	
    @Test
    public void testEquality() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(set1.equals(set2));
    }
    
    @Test
    public void testContains() {
        IntegerSet set = new IntegerSet();

        set.add(1);
        set.add(2);
        set.add(3);

        assertTrue(set.contains(2));
        assertFalse(set.contains(4));
    }
    
    @Test
    public void testLargestWithNonEmptySet() {
        IntegerSet set = new IntegerSet();

        set.add(5);
        set.add(10);
        set.add(3);

        try {
            assertEquals(10, set.largest());
        } catch (IntegerSetException e) {
            fail("Should not throw an exception for non-empty set");
        }
    }
    
    @Test
    public void testLargestWithEmptySet() {
        IntegerSet set = new IntegerSet();

        try {
            set.largest();
            fail("Should throw an exception for empty set");
        } catch (IntegerSetException e) {
            // Expected behavior
        }
    

}


