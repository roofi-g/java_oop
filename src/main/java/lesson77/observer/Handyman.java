package lesson77.observer;

import java.util.Random;

public class Handyman implements Observer {

    private static Random random = new Random();
    private String name;

    private int minSalary;

    public Handyman(String name) {
        this.name = name;
        minSalary = random.nextInt(10000, 20000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("Разнорабочий %s (%d) >>> Мне нужна эта работа! [%s - %d]\n",
                    name, minSalary, companyName, vacancy.getSalary());
            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Разнорабочий %s >>> Я найду работу получше (%d)! [%s - %d]\n",
                    name, minSalary, companyName, vacancy.getSalary());
        }
    }
}
