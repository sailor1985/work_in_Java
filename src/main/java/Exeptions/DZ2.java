package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        //������ 1:
        System.out.println(floatValue());


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
}
