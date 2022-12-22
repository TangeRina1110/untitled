package HomeWork5;

import java.awt.*;
public class Circle extends Shape {
    int radius;

    public Circle(int X, int Y, Color color, int radius) {
        super(color, Y, X);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

}