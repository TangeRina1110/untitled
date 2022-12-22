package Task3;
import Task3.Circle;
import java.util.Scanner;

public class Testing {
    private int num;
    public static Circle[] circ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        circ = new Circle[num];
        for(int i=0; i<num; i++){
            circ[i]= new Circle(new Point(scanner.nextInt(), scanner.nextInt()), scanner.nextInt());
        }
        for(int i=0; i<num; i++){
            System.out.println("Длина : ");
            System.out.println(circ[i].getLen());
        }
    }
}