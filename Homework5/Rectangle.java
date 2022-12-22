package HomeWork5;

import java.awt.*;

public class Rectangle extends Shape {
    int height;
    int wid;
    public Rectangle (int X, int Y, Color color, int wid, int height){
        super(color, X, Y);
        this.wid = wid;
        this.height = height;

    }
    public int getWid(){return wid;}
    public void setWid(int wid){this.wid = wid;}
    public int getHeight(){return height;};
    public void setHeight(int height){this.height = height; }
}