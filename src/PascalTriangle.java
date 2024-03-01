public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;

        int[][] pascalTriangle = generatePascalTriangle(rows);

        System.out.println("Треугольник Паскаля:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для генерации треугольника Паскаля
    public static int[][] generatePascalTriangle(int rows) {
        int[][] pascalTriangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1; // Установка единицы в начале строки
            pascalTriangle[i][i] = 1; // Установка единицы в конце строки

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        return pascalTriangle;
    }
}
