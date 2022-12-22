package Homework7.Move2;

import Homework7.Move2.MovablePoint2;
import Homework7.Move2.MovableRectangle2;

public class Move_Test {
    public static void main(String[] args) {
        MovablePoint2 topleft = new MovablePoint2(15,15,2);
        MovablePoint2 bottomright = new MovablePoint2(5,5,2);
        MovableRectangle2 rect = new MovableRectangle2(bottomright,topleft);
        System.out.println(rect);
        if(rect.SpeedTest(topleft,bottomright)){
            rect.moveDown(10);
            System.out.println(rect);
        }
    }
}
