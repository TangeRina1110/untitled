import java.util.Scanner;
    public class First_hw {

        public static void main(String[] args) {


            var scanner = new Scanner(System.in);

            System.out.println("Введите размер списка");

            int size = scanner.nextInt();

            System.out.println("Введите элементы массива");

            var array = new int[size];

            for (int i = 0; i < size; i++) {

                array[i] = scanner.nextInt();

            }

            System.out.println("Результат через for: "+ forSum(array, size).toString());


            System.out.println("Результат через while: "+ whileSum(array, size).toString());


            System.out.println("Результат через do while: "+ doWhileSum(array, size).toString());


        }


        public static Long forSum(int[] array, int size) {

            long sum = 0;
            for (int i = 0; i < size; i++) sum += array[i];


            return sum;
        }

        public static Long whileSum(int[] array, int size) {

            long sum = 0;
            int i = 0;
            while (i < size) {
                sum += array[i];
                i++;
            }


            return sum;
        }

        public static Long doWhileSum(int[] array, int size) {

            long sum = 0;
            int i = 0;

            if (size == 0) return (long)0;
            do {
                sum += array[i];
                i++;
            }
            while (i < size );

            return sum;
        }

    }
