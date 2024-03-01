import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            double average = ((double)a + (double)b + (double)c) / 3;
            int max = 0;

            if (a > b) {
                if (a > c) {
                    max = a;
                } else {
                    max = c;
                }
            } else if (b > a) {
                if (b > c) {
                    max = b;
                } else {
                    max = c;
                }
            }

            System.out.println("Среднее арифметическое трех чисел: " + average);
            System.out.println("Максимольное значение из трех чисел: " + max);
        }

}