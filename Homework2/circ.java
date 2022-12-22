package Task6;

public class circ {
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public circ(double r){
        this.radius=r;
    }
    public double sq(){
        return radius*3.14*3.14;
    }
    public double len(){
        return(radius*2*3.14);
    }
    public boolean biggest(circ c){
        return(this.sq()>c.sq());
    }
}
