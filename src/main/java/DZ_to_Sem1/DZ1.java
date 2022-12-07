package DZ_to_Sem1;

import java.util.Arrays;
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        //System.out.println(ex1(summa_of_digits())); //Задача 1

        //System.out.print("Введите целое положительно (отрицательное) число: ");
        //Scanner scanner = new Scanner(System.in);
        //int number1 = scanner.nextInt();
        //ex2(number1); //Задача 2

        //System.out.print("Введите целое положительно (отрицательное) число: ");
        //Scanner scanner = new Scanner(System.in);
        //int number2 = scanner.nextInt();
        //System.out.println(ex3(number2));//Задача 3

//        System.out.print("Введите число: ");
//        Scanner scanner = new Scanner(System.in);
//        int number3 = scanner.nextInt();
//        System.out.println("Введите строку: ");
//        Scanner scanner1 = new Scanner(System.in);
//        String str = scanner1.nextLine();

//        System.out.print("Введите число и строку через пробел: ");
//        Scanner scanner = new Scanner(System.in);
//        int number3 = scanner.nextInt();
//        String str = scanner.nextLine();
//        ex4(number3, str); //Задача 4

        ex6();

    }

    //   Задача 1: Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    //   от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static int summa_of_digits() {
        System.out.print("Введите 2 числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int sum = number_1 + number_2;
        System.out.printf("Сумма чисел = %d%n", sum);
        return sum;
    }

    public static boolean ex1(int sum) {
        return sum >= 10 && sum <= 20;
    }

    //    Задача 2: Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    private static void ex2(int number) {
        if (number >= 0) {System.out.println("Передано положительное число");}
        else {System.out.println("Передано отрицательное число");}
    }

    //    Задача 3: Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    //    если число отрицательное, и вернуть false если положительное.
    public static boolean ex3(int number2) {
        return number2 < 0;
    }

//    Задача 4: Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
//    в консоль указанную строку, указанное количество раз

    private static void ex4(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.printf("%s%n", str);
        }
    }

//    Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0

    private static void ex6() {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1) {arr[i] = 0;}
            else {arr[i] = 1;}
        }
        System.out.println(Arrays.toString(arr));
        }



}
