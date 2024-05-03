package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;

public class ShapeTest {
	private FactShape factShape;
	
	
	 @Before
	    public void setUp() {
	        factShape = new FactShape();
	    }
	 
	 @Test
	    public void testICircle() {
	        Shape circle = factShape.createShape("Circle");
	        assertNotNull(circle); //  Circle instance is created
	        assertTrue(circle instanceof Circle); // Check the instance type is Circle
	 }
	 
	 @Test
	    public void testIRectangle() {
	        Shape rectangle = factShape.createShape("Rectangle");
	        assertNotNull(rectangle); // Rectangle instance is created
	        assertTrue(rectangle instanceof Rectangle); // Check the instance type is Rectangle
	 }
}