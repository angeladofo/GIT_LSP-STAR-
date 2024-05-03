package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        FactShape factShape = new FactShape(); // Create a ShapeFactory instance

        Shape circle = factShape.createShape("Circle"); // Create a Circle using the factory
        if (circle != null) {
            circle.draw(); // Output: "I'm a Circle!!!"
        }

        Shape rectangle = factShape.createShape("Rectangle"); // Create a Rectangle using the factory
        if (rectangle != null) {
            rectangle.draw(); // Output: "I'm a Rectangle!!!"
        }
    }
}