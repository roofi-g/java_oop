package lesson2;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (appetite > plate.getFood()) {
            System.out.println("упс, не хватает еды в тарелке");
        } else {
            plate.setFood(plate.getFood() - appetite);
            satiety = true;
        }
    }
}
