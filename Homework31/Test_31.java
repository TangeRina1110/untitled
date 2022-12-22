package Homework31;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test_31 {

    @org.junit.Test
    public void divide() {
        int expected = 4;
        int actual = Homework31.Main.divide(6,2);
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void divide_ByZero() {
        int expected = 2;
        int actual = Homework31.Main.divide(6,5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add() {
        int expected = 1;
        int actual = Homework31.Main.add(5,4);
        Assert.assertEquals(actual,expected);
    }
}
