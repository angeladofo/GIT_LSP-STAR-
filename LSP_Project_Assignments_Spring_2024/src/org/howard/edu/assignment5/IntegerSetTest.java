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

    @Test
    public void testSmallestWithNonEmptySet() {
        IntegerSet set = new IntegerSet();

        set.add(5);
        set.add(10);
        set.add(3);

        try {
            assertEquals(3, set.smallest());
        } catch (IntegerSetException e) {
            fail("Should not throw an exception for non-empty set");
        }
    }

    @Test
    public void testSmallestWithEmptySet() {
        IntegerSet set = new IntegerSet();

        try {
            set.smallest();
            fail("Should throw an exception for empty set");
        } catch (IntegerSetException e) {
            // Expected behavior
        }
    }
    @Test
    public void testAddNewItem() {
        IntegerSet set = new IntegerSet();

        set.add(5);
        set.add(10);

        assertEquals(2, set.length());
        assertTrue(set.contains(5));
        assertTrue(set.contains(10));
    }

    @Test
    public void testAddExistingItem() {
        IntegerSet set = new IntegerSet();

        set.add(5);
        set.add(5); // Adding the same item again

        assertEquals(1, set.length()); // Length should remain the same
        assertTrue(set.contains(5)); // The item should still be in the set
    }
    
    @Test
    public void testRemoveExistingItem() {
        IntegerSet set = new IntegerSet();

        set.add(5);
        set.add(10);

        set.remove(5);

        assertEquals(1, set.length()); // Only one item should remain in the set
        assertFalse(set.contains(5)); // The removed item should not be in the set anymore
        assertTrue(set.contains(10)); // The other item should still be in the set
    }
    
    @Test
    public void testRemoveNonExistingItem() {
        IntegerSet set = new IntegerSet();

        set.add(5);
        set.add(10);

        set.remove(15); // Trying to remove an item that doesn't exist

        assertEquals(2, set.length()); // The length should remain unchanged
        assertTrue(set.contains(5)); // Both items should still be in the set
        assertTrue(set.contains(10));
    }
    
    @Test
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        IntegerSet unionSet = set1.union(set2);

        assertEquals(5, unionSet.length()); // The union set should have 5 elements (1, 2, 3, 4, 5)
        assertTrue(unionSet.contains(1));
        assertTrue(unionSet.contains(2));
        assertTrue(unionSet.contains(3));
        assertTrue(unionSet.contains(4));
        assertTrue(unionSet.contains(5));
    }
    
    @Test
    public void testIntersect() {
        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();

        // Adding elements to set A
        setA.add(1);
        setA.add(2);
        setA.add(3);

        // Adding elements to set B
        setB.add(2);
        setB.add(3);
        setB.add(4);

        // Performing intersection
        setA.intersect(setB);

        // Verifying the result
        assertEquals(2, setA.length()); // The intersection should contain two elements (2, 3)
        assertTrue(setA.contains(2));
        assertTrue(setA.contains(3));
        assertFalse(setA.contains(1)); // 1 should not be in the intersection
        assertFalse(setA.contains(4)); // 4 should not be in the intersection
    }
    
    @Test
    public void testDiff() {
        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();

        // Adding elements to set A
        setA.add(1);
        setA.add(2);
        setA.add(3);

        // Adding elements to set B
        setB.add(2);
        setB.add(3);
        setB.add(4);

        // Performing set difference
        setA.diff(setB);

        // Verifying the result
        assertEquals(1, setA.length()); // The difference should contain one element (1)
        assertTrue(setA.contains(1)); // 1 should be in the difference
        assertFalse(setA.contains(2)); // 2 should not be in the difference
        assertFalse(setA.contains(3)); // 3 should not be in the difference
        assertFalse(setA.contains(4)); // 4 should not be in the difference
    }



}


