import java.util.Scanner;
public class Counting2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        int number = (int) number1;
        double ost = number1 - number;
        int CC = scan.nextInt();
        int tmp;
        char temp;
        String newnum = new String();

        while (true) {
            tmp = number % CC;
            if (tmp >= 10) {
                temp = (char) (tmp + 55);
                newnum += temp;
            } else {
                newnum += Integer.toString(tmp);
            }

            number /= CC;
            if (number == 0) {
                break;
            }
        }
        String itog = new String();
        for (int i = newnum.length() - 1; i >= 0; i--) {
            itog += newnum.charAt(i);
        }
        String newnum1 = new String();
        int tmp1;
        for (int i = 0; i < 3; i++) {
            tmp1 = (int) (ost * CC);
            if (tmp1 >= 10) {
                char temp1 = (char) (tmp1 + 55);
                newnum1 += temp1;
            } else {
                newnum1 += Integer.toString(tmp1);
            }

            ost *= CC;
            int ost1 = (int) ost;
            ost -= ost1;
        }

        String itog1 = new String();

        itog = itog + "." + newnum1;

        System.out.println(itog);

    }
}