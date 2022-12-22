package Task8;
import java.util.Scanner;

public class mas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] str = new String[len];
        for(int i=0; i<len; i++){
            str[i]=sc.next();
        }
        for(int i=0; i<(len/2); i++)
        {
           String temp = str[i];
           str[i]=str[len-i-1];
           str[len-i-1]=temp;
        }
        for (int i=0; i<len; i++) {
            System.out.print(str[i] + " ");
        }
    }
}