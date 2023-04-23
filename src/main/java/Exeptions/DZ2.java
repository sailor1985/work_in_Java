package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        //������ 1:
        //System.out.println(floatValue());
        //������ 2:
        task2();

    }

    /* ������ 1:
       ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ���������� ��������� ��������.
       ���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ��������� � ������������ ���� ������.
     */
    public static float floatValue() {
        while (true)
            try {
                System.out.print("������� ������� �����:");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("������� ������� ����� ���������");
            }
    }

    /* ������ 2: ���� ����������, ��������� ������ ��� */
    public static void task2() {
        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8};
            int d = 0;
            double caughtRes1 = intArray[7] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException e) {
            System.out.println("������� ����������: ArithmeticException\n" + "������ ��������: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������� ����������: ArrayIndexOutOfBoundsException\n " + "������ ��������: " + e);
        }
    }

}
