package DZ_to_Sem3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        removingEvenNumbers();
    }

//    1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
private static void removingEvenNumbers() {
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        list.add(random.nextInt(10));
    }
    System.out.println("Оригинал: " + list.toString());
    list.removeIf(i-> (i % 2 ==0));
    System.out.println("Новый список: " + list.toString());
}

}


