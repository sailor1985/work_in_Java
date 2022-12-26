package DZ_to_Sem6;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private final int warrantyPeriod; //срок гарантии
    private final double screenDiagonal;//диагональ экрана
    private final String firma;// фирма-производитель
    private final String operatingSystem;//операционная система
    private final String model;// модель
    private final String processor; //процессор

    private final List<HardDisc> hardDiscsList;

//    private final List<Notebook> list;
    private boolean power = false;

    @Override
    public String toString() {
        return String.format("firma: %s, model: %s, operatingSystem: %s, screenDiagonal: %.1f, warrantyPeriod: %d, hardDiscsList: %s", firma, model, operatingSystem, screenDiagonal, warrantyPeriod, hardDiscsList);
    }

    public Notebook(String firma, String model, String processor, String operatingSystem, double screenDiagonal, int warrantyPeriod, List<HardDisc> hardDiscsList) {
        this.firma = firma;
        this.model = model;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.screenDiagonal = screenDiagonal;
        this.warrantyPeriod = warrantyPeriod;
        this.hardDiscsList = hardDiscsList;
//        this.list = list;
    }

    public void switchOn() {
        power = true;
    }

    public void switchOff() {
        power = false;
    }

    public String checkVirus() {
        return "Checked";
    }

    public void getSizeHardDisc() {
        int size = 0;
        for (HardDisc hardDisc : hardDiscsList) {
            size += hardDisc.getSize();
        }
        System.out.println(size);
    }

    public void checkScreenDiagonalMore15(ArrayList<Notebook> list) {
        for (Notebook notebook : list) {
            if (screenDiagonal > 15) {
                System.out.println(notebook.screenDiagonal);
            }
        }
    }

//    public void weightCat() {
//        System.out.println(weight);
//    }


//    public void descrition() {
//        System.out.println("Что умеет кот: ");
//        sleep();
//        eat();
//        speak();
//    }

//    public void printInfo() {
//        System.out.printf("У кота %s возраст: %d, цвет: %s, вес: %s, а хозяин живет: %s\n", name, age, color, weight, ownerAdress);
//    }
//
}
