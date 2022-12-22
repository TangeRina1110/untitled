package HomeWork5;

import java.awt.*;

public abstract class Shape {
    public Shape(Color color, int posX, int posY) {
        this.x = posX;
        this.y = posY;
        this.color = color;
    }

    protected Color color;
    protected int x;
    protected int y;

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
