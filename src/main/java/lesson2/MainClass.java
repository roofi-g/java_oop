package lesson2;

public class MainClass {
    public static void main(String[] args) {

        Plate plate = new Plate(50);

        Cat[] cats = {
                new Cat("Барсик", 5, false),
                new Cat("Мурзик", 20, false),
                new Cat("Снежок", 15, false),
                new Cat("Васька", 10, false),
                new Cat("Мурка", 3, false),
        };

        for (Cat cat: cats) {
            cat.eat(plate);
            System.out.println(cat.isSatiety());
        }

        plate.info();
        plate.addFood(10);
        plate.info();

    }
}