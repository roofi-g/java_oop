package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

//        Product product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
//        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        Product bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);

        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);

        Product darkСhocolate = new Chocolate("COAO Коммунарка", "Темный шоколад", 180, 100, 580);
        Product whiteChocolate = new Chocolate("ООО Победа", "Белый шоколад", 200, 85, 540);
        Product milkChocolate = new Chocolate("Красный Октябрь", "Молочный шоколад", 250, 90, 550);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);

        products.add(darkСhocolate);
        products.add(whiteChocolate);
        products.add(milkChocolate);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        Chocolate chocolateResult = vendingMachine.getChocolate(10);
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }

}
