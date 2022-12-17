package Sem4;

import java.util.LinkedList;

public class MyStack {
    private static LinkedList<String> stack;

    public static void main(String[] args) {
        push("hello"); //добавить в конец
        System.out.println(peek()); //посмотреть последнее в стеке
        System.out.println(pop()); //посмотреть и извлечь последнее в стеке
    }

    private static void push(String hello) {

    }

    private static String peek() {
        return "";
    }

    private static String pop() {
        return "";
    }
}
