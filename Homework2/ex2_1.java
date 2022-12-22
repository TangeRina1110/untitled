package Task2;

public class ex2_1 {
    private double temp;
    public static void main(String[] args) {
        ex2 test = new ex2(3.4, 4.5);
        test.move(10.5, 4.5);
        System.out.println(test.getX());
        System.out.println(test.getY());


    }
}
