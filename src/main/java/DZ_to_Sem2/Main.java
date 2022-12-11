package DZ_to_Sem2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(ex1("А роза упала на лапу Азора")); //Задача 1
        //System.out.println(ex2("aaaabbbcdd")); //Задача 2

//
//        String str = "А роза упала на лапу Азора";
//        String clean = str.replaceAll(" ", "").toLowerCase();
//        System.out.println(clean);

    }

private static boolean ex1(String str) {
    String clean = str.replaceAll(" ", "").toLowerCase();
    int length = clean.length() - 1;
    int firstIndex = 0;
    int lastIndex = length;
    while (lastIndex > firstIndex) {
        if (clean.charAt(firstIndex++) != clean.charAt(lastIndex--)) {
            return false;
        }
    }
    return true;
    }



}
//    1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

