package Task6;

import java.util.Scanner;

public class TestCerc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circ c1 = new circ(sc.nextInt());
        circ c2 = new circ(sc.nextInt());
        System.out.println("Circles's lenght:"  + c1.len() + " " + c2.len());
        if(c1.biggest(c2)){
            System.out.println("first one is bigger");
        }
        else
        {
            System.out.println("second one is bigger");
        }
    }

}
