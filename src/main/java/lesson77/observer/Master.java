package lesson77.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;
    private int minSalary;
    private String profession;

    public Master(String name, String profession) {
        this.name = name;
        minSalary = random.nextInt(60000, 80000);
        this.profession = profession;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (profession == vacancy.getPosition() && minSalary <= vacancy.getSalary()){
            System.out.printf("Мастер %s (%d - %s) >>> Мне нужна эта работа! [%s - %d - %s]\n",
                    name, minSalary, profession, companyName, vacancy.getSalary(), vacancy.getPosition());
//            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше (%d)! [%s - %d]\n",
                    name, minSalary, companyName, vacancy.getSalary());
        }
    }
}
