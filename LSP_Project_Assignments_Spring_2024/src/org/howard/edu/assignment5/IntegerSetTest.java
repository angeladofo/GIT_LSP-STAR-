package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.*;
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

}


