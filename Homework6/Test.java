package Homework6.MOve;

public class Test{
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(1,1,10,10,9,9);
        rect.moveUp();
        System.out.println(rect);
    }
}