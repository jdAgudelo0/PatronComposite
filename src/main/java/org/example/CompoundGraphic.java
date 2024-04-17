package org.example;

import java.util.ArrayList;
import java.util.List;

// Composite Component: CompoundGraphic
class CompoundGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    // Method to add a child graphic
    public void add(Graphic graphic) {
        children.add(graphic);
    }

    // Method to remove a child graphic
    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    // Implementation of the draw method for a compound graphic
    @Override
    public void draw() {
        // Draw all children graphics
        for (Graphic graphic : children) {
            graphic.draw();
        }
    }
}