package Homework7.Move2;

import Homework7.Move2.Movable2;

public class MovablePoint2 implements Movable2 {
    int x;
    int y;
    int Speed;

    int GetSpeed(){return this.Speed;}

    public MovablePoint2(int x, int y, int Speed) {
        this.x = x;
        this.y = y;
        this.Speed = Speed;
    }

    @Override
    public void moveLeft(int x) {
        this.x-=x*this.Speed;
    }

    @Override
    public void moveRight(int x) {
        this.x+=x*this.Speed;
    }

    @Override
    public void moveUp(int y) {
        this.y+=y*this.Speed;
    }

    @Override
    public void moveDown(int y) {
        this.y-=y*this.Speed;
    }

    @Override
    public String toString() {
        return  "x = "+x+" y = " + y;
    }
}
