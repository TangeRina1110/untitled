package Homework6.Temperature;

import java.util.Scanner;

class OutTemp {
    public static void main(String[] args)
    {
        Convertible A = new Temperature();
        System.out.print("1.По Фаренгейту 2.По Кельвину: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n)
        {
            case 1:
            {
                System.out.print("Введите температура по Цельсию: ");
                System.out.printf("Температура по Фаренгейту: %s",A.convert(scanner.nextDouble(),1));
                break;
            }
            case 2:
            {
                System.out.print("Введите температура по Цельсию: ");
                System.out.printf("Температура по Кельвину: %s",A.convert(scanner.nextDouble(),2));
                break;
            }
        }
    }
}
