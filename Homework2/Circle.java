package Task3;

public class Circle {
    private Point c = new Point(0.0, 0.0 );
    private double r = 4.0;
    public Circle(Point c, double r){
        this.c = c;
        this.r = r;
    }
    public double getLen(){
        return 2*3.14*r;
    }

}
