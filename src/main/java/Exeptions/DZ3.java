package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            System.out.println("Insert int value");
//            printValidValue(sc, "[0-9]+");
        //System.out.print("������� ����� ��������: ");
//            System.out.println("Insert name");
//            printValidValue(sc, "[a-zA-Z]+");
        System.out.print("������� ����� ��������: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("�������� ����. ��� ����� ��������: " + telephoneNumber(scanner));

    }
    //telephoneNumber();


    public static String floatValue() {
        while (true)
            try {
                System.out.print("������� ������� �����:");
                Scanner scanner = new Scanner(System.in);
                return scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("������������ ����! ������� �� �����.\n" + "�������� ������: " + e + "\n"+ "��������� ������� ������\n");
            }
    }

    public static int telephoneNumber(Scanner scanner) {
        while (true)
            try {
                if (scanner.nextLine().isEmpty()) {
                    throw new NullPointerException("������������ ����! ������ ������ ������� ������");
                } else if (scanner.hasNextLine()) {
                    throw new InputMismatchException("������������ ����! ������� �� �����");
                }
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "\n�������� ������: " + e + "\n"+ "��������� ������� ������\n");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage() + "\n"+ "��������� ������� ������");
            }
    }

    public static void fio() {
        while (true)
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("������� ����� ��������: ");

                System.out.println("�������� ����. ��� ����� ��������: " + scanner.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("������������� ����! ������� �� �����." + e+ "\n��������� ������� ������");
            }
    }

}

//    public static void requestingDataFromUser () {
//        Scanner scanner = new Scanner(System.in);
//        int telephoneNumber = scanner.nextInt();
//        while (true) {
//            try {
//                System.out.println("�������� �������: " + telephoneNumber);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("������������� ����! ��������� ������� ������");
//                scanner.nextInt();
//            }
//        }

//        while (true) {
//
//            try {
//                System.out.print("������� �������:");
//                if (scanner.hasNextLine()) {
//                    String surname = scanner.next();
//                    System.out.println("���� �������: " + surname);
//                } else {
//
//                }
//
//
//                System.out.print("������� ���: ");
//                String name = scanner.next();
//                System.out.println("���� ���: " + name);
//
//                System.out.print("������� ��������: ");
//                String middleName = scanner.next();
//                System.out.println("���� ��������: " + middleName);
//
//                System.out.print("������� ���� �������� � ������� dd.mm.yyyy:");
//                String dateOfBirth = scanner.next();
//                System.out.println("���� ���� ��������: " + dateOfBirth);
//            } catch () {
//
//            }
//
//        }
