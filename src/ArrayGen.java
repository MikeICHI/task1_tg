import java.util.Arrays;

public class ArrayGen {
    public static void main(String[] args) {
        int K = 100;
        int[] array = generateRandomArray(100, K);

        int primeCount = countPrimes(array);
        int multipleOfThreeCount = countMultiplesOfThree(array);

        System.out.println("Количество простых чисел: " + primeCount);
        System.out.println("Количество чисел, кратных 3: " + multipleOfThreeCount);

        Arrays.sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    // Метод для генерации случайного массива
    public static int[] generateRandomArray(int size, int K) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (K + 1));
        }
        return array;
    }

    // Метод для подсчета количества простых чисел в массиве
    public static int countPrimes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Метод для подсчета количества чисел, кратных 3, в массиве
    public static int countMultiplesOfThree(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}
