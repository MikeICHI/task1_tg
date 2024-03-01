public class FibonacciGenerator {
    public static void main(String[] args) {
        int N = 10;

        int[] fibonacciArray = generateFibonacciArray(N);

        System.out.println("Числа Фибоначчи:");
        for (int num : fibonacciArray) {
            System.out.print(num + " ");
        }
    }

    // Метод для генерации массива чисел Фибоначчи
    public static int[] generateFibonacciArray(int N) {
        int[] fibonacciArray = new int[N];

        if (N >= 1) {
            fibonacciArray[0] = 0;
        }
        if (N >= 2) {
            fibonacciArray[1] = 1;
        }
        if (N >= 3) {
            for (int i = 3; i < N; i++) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
        }

        return fibonacciArray;
    }
}
