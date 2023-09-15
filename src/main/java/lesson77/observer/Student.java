package lesson77.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private String name;

    private int minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextInt(2000, 4000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("Студент %s (%d) >>> Мне нужна эта работа! [%s - %d]\n",
                    name, minSalary, companyName, vacancy.getSalary());
//            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%d)! [%s - %d]\n",
                    name, minSalary, companyName, vacancy.getSalary());
        }
    }
}
