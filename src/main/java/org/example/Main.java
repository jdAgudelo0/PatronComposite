package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {// Create simple shapes
        Graphic circle = new SimpleShape("Circle");
        Graphic rectangle = new SimpleShape("Rectangle");

        // Create a compound graphic
        CompoundGraphic compoundGraphic = new CompoundGraphic();
        compoundGraphic.add(circle);
        compoundGraphic.add(rectangle);

        // Draw the compound graphic
        compoundGraphic.draw();
    }
}