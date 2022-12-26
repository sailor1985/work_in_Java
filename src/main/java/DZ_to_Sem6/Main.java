package DZ_to_Sem6;

import Sem6.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HardDisc> hardDiscList = new ArrayList<>();
        hardDiscList.add(new HardDisc(500));
        hardDiscList.add(new HardDisc(1000));

        Notebook notebook1 = new Notebook("Asus VivoBook", "Vivobook 15 F51", "Intel Core i3", "Windows 11 Home", 15.6, 1, hardDiscList);

        Notebook notebook2 = new Notebook("Macbook Pro", "MacBook Pro 14 2021 (Z15J000DW)", "Apple M1 Pro", "macOS", 14.2, 1, hardDiscList);

        Notebook notebook3 = new Notebook("HUAWEI MateBook", "MateBook D 14", "Intel Core i3", "Windows 11 Home", 14, 1, hardDiscList);

        // cat1.descrition();
        // cat1.printInfo();
        Cat cat2 = new Cat(6, 2, "Степан", "Серый", "Тверская-Ямская, 5");
        // cat2.descrition();
        // cat2.printInfo();
        // cat2.sleep();
        // cat2.speak();
        // cat2.eat();
        Cat cat3 = new Cat(6, 2, "Богдан", "Серый", "Тверская-Ямская, 5");
        ArrayList<Notebook> list = new ArrayList<>(); // cоздаем множество ноутбуков
        list.add(notebook1);
        list.add(notebook2);
        list.add(notebook3);
        System.out.println(list);

//        list.


    }
}
