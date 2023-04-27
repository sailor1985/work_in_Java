package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            System.out.println("Insert int value");
//            printValidValue(sc, "[0-9]+");
        //System.out.print("Введите номер телефона: ");
//            System.out.println("Insert name");
//            printValidValue(sc, "[a-zA-Z]+");
        System.out.print("Введите номер телефона: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Успешный ввод. Ваш номер телефона: " + telephoneNumber(scanner));

    }
    //telephoneNumber();


    public static String floatValue() {
        while (true)
            try {
                System.out.print("Введите дробное число:");
                Scanner scanner = new Scanner(System.in);
                return scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод! Введено не число.\n" + "Название ошибки: " + e + "\n"+ "Повторите попытку заново\n");
            }
    }

    public static int telephoneNumber(Scanner scanner) {
        while (true)
            try {
                if (scanner.nextLine().isEmpty()) {
                    throw new NullPointerException("Некорректный ввод! Пустые строки вводить нельзя");
                } else if (scanner.hasNextLine()) {
                    throw new InputMismatchException("Некорректный ввод! Введено не число");
                }
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "\nНазвание ошибки: " + e + "\n"+ "Повторите попытку заново\n");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage() + "\n"+ "Повторите попытку заново");
            }
    }

    public static void fio() {
        while (true)
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите номер телефона: ");

                System.out.println("Успешный ввод. Ваш номер телефона: " + scanner.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректныйй ввод! Введено не число." + e+ "\nПовторите попытку заново");
            }
    }

}

//    public static void requestingDataFromUser () {
//        Scanner scanner = new Scanner(System.in);
//        int telephoneNumber = scanner.nextInt();
//        while (true) {
//            try {
//                System.out.println("Значение принято: " + telephoneNumber);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Некорректныйй ввод! Повторите попытку заново");
//                scanner.nextInt();
//            }
//        }

//        while (true) {
//
//            try {
//                System.out.print("Введите фамилия:");
//                if (scanner.hasNextLine()) {
//                    String surname = scanner.next();
//                    System.out.println("Ваша фамилия: " + surname);
//                } else {
//
//                }
//
//
//                System.out.print("Введите имя: ");
//                String name = scanner.next();
//                System.out.println("Ваше имя: " + name);
//
//                System.out.print("Введите отчество: ");
//                String middleName = scanner.next();
//                System.out.println("Ваше отчество: " + middleName);
//
//                System.out.print("Введите дату рождения в формате dd.mm.yyyy:");
//                String dateOfBirth = scanner.next();
//                System.out.println("Ваша дата рождения: " + dateOfBirth);
//            } catch () {
//
//            }
//
//        }
