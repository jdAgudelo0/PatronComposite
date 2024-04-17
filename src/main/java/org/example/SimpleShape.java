package org.example;

// Leaf Component: SimpleShape
class SimpleShape implements Graphic {
    private String shapeType;

    // Constructor to initialize with the type of shape
    public SimpleShape(String shapeType) {
        this.shapeType = shapeType;
    }

    // Implementation of the draw method for a simple shape
    @Override
    public void draw() {
        System.out.println("Drawing " + shapeType);
    }
}