package OOP.DZ_to_Sem1.ex3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 3: тигр нападает на человек");
        task3();
    }

    private static void task3() {
        Human3 human3 = new Human3("Вася");
        Animal tiger = new Tiger();
        for (int i = 0; i < 22; i++) {
            tiger.attack(human3);
        }
    }
}
