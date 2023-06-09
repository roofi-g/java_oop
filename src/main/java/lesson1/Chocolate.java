package lesson1;

public class Chocolate extends Product{
    private int gram;
    private int calories;
//    private double cocoaContent;


    public int getGram() {
        return gram;
    }

    public Chocolate(String brand, String name, double price, int gram, int calories) {
        super(brand, name, price);
        this.gram = gram;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад]%s - %s - %f - [грамм: %d] - [каллорийность: %d]", brand, name, price, gram, calories);
    }
}
