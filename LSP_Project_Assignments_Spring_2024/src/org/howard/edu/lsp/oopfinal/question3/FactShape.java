package org.howard.edu.lsp.oopfinal.question3;

public class FactShape {
    // Create a shape based on the given type
    public Shape createShape(String shapeT) {
        if (shapeT == null) {
            return null;
        }
        if (shapeT.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeT.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null; // Return null if the shape type is unknown
    }
}