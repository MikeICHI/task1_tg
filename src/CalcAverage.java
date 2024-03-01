import java.util.Scanner;

public class CalcAverage {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое шестнадцатеричное число:");
        String hexNum1 = scanner.nextLine();
        System.out.println("Введите второе шестнадцатеричное число:");
        String hexNum2 = scanner.nextLine();

        System.out.println("Результаты операций в шестнадцетиричных числах:");
        System.out.println("Сложение: " + hexNum1 + " + " + hexNum2 + " = " + Long.toHexString(Long.parseLong(hexNum1, 16) + Long.parseLong(hexNum2, 16)));
        System.out.println("Вычитание: " + hexNum1 + " - " + hexNum2 + " = " + Long.toHexString(Long.parseLong(hexNum1, 16) - Long.parseLong(hexNum2, 16)));
        System.out.println("Умножение: " + hexNum1 + " * " + hexNum2 + " = " + Long.toHexString(Long.parseLong(hexNum1, 16) * Long.parseLong(hexNum2, 16)));
        System.out.println("Деление: " + hexNum1 + " / " + hexNum2 + " = " + Long.toHexString(Long.parseLong(hexNum1, 16) / Long.parseLong(hexNum2, 16)));

        //преобразование строкового типа в численный, с учетом того что строковый тип записан как шестнадцетиричное число
        int num1 = Integer.parseInt(hexNum1, 16);
        int num2 = Integer.parseInt(hexNum2, 16);

        System.out.println("Шестнадцетиричное число: "+ hexNum1+" в десятичном виде: "+ num1);
        System.out.println("Шестнадцетиричное число: "+ hexNum2+" в десятичном виде: "+ num2);
        System.out.println("Результаты операций в десятичных числах:");
        System.out.println("Сложение: " + num1 + " + " + num2 + " = " + (Integer.parseInt(hexNum1,16) + Integer.parseInt(hexNum2,16)));
        System.out.println("Вычитание: " + num1 + " - " + num2 + " = " + (Integer.parseInt(hexNum1,16) - Integer.parseInt(hexNum2,16)));
        System.out.println("Умножение: " + num1 + " * " + num2 + " = " + Integer.parseInt(hexNum1,16) * Integer.parseInt(hexNum2,16));
        System.out.println("Деление: " + num1 + " / " + num2 + " = " + (double)Integer.parseInt(hexNum1,16) / (double)Integer.parseInt(hexNum2,16));



        System.out.println("Инкремент (префикс): ++" + hexNum1 + " = " + Integer.toHexString(++num1));
        System.out.println("Инкремент (постфикс): " + hexNum1 + "++ = " + Integer.toHexString(num1++));
        System.out.println("Декремент (префикс): --" + hexNum2 + " = " + Integer.toHexString(--num2));
        System.out.println("Декремент (постфикс): " + hexNum2 + "-- = " + Integer.toHexString(num2--));

        System.out.println("Побитовое И: " + hexNum1 + " & " + hexNum2 + " = " + Integer.toHexString(num1 & num2));
        System.out.println("Побитовое ИЛИ: " + hexNum1 + " | " + hexNum2 + " = " + Integer.toHexString(num1 | num2));
        System.out.println("Побитовое исключающее ИЛИ: " + hexNum1 + " ^  " + hexNum2 + " = " + Integer.toHexString(num1 ^ num2));
        System.out.println("Сдвиг влево: " + hexNum1 + " << 1 = " + Integer.toHexString(num1 << 1));
        System.out.println("Сдвиг вправо: " + hexNum2 + " >> 1 = " + Integer.toHexString(num2 >> 1));
    }
}