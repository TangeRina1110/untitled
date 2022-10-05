import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int from;
        int to;

        var scanner = new Scanner(System.in);
        from = scanner.nextInt();
        to = scanner.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= to; i++) {
            if (i >= from) {
                System.out.println(a);
            }
            int c=0;
            c = a + b;
            a = b;
            b = c;
        }
    }

}
