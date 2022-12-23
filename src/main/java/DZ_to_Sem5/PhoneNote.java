package DZ_to_Sem5;

import java.util.*;

public class PhoneNote {
    static Map<String, ArrayList<String>> phoneNote = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(addTelephones());
    }

    private static ArrayList<String> addTelephones() {
        ArrayList<String> telephones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько номеров телефона вы будете вводить: ");
        int quantity = scanner.nextInt();
        for (int i = 1; i < quantity + 1; i++) {
            System.out.printf("Введите %d номер телефона: ", i);
            String number = scanner.next();
            telephones.add(number);
        }
        return telephones;
    }

//        telephones.add("08");
//        telephones.add("911");
//        telephones.add("942334");
//        System.out.println(telephones);
//        System.out.println(telephones.get(0));


    private static void add1() {
        List<String> telephones = new ArrayList<>();
        telephones.add("08");
        telephones.add("911");
        telephones.add("942334");
        System.out.println(telephones);
        System.out.println(telephones.get(0));
//        phoneNote.putIfAbsent("Иванов", telephones.get());
//        phoneNote.putIfAbsent("Иванов", telephones.get(1));
//        phoneNote.putIfAbsent("Петров", telephones.get(2));

//        System.out.println(phoneNote);
    }



}
