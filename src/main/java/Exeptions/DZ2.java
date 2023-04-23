package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        //Задача 1:
        System.out.println(floatValue());


    }

    /* Задача 1:
       Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
       Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static float floatValue() {
        while (true)
            try {
                System.out.print("Введите дробное число:");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Введите дробное число корректно");
            }
    }
}
