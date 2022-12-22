package Task2;

public class ex2 {
    private double x = 0.0;
    private double y = 0.0;

    public ex2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ex2() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {

    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }


    @Override
    public String toString() {
        return "ex2{" + "x=" + x + ", y=" + y + '}';
    }
}
