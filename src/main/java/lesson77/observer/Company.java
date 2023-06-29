package lesson77.observer;

import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;
    private int maxSalary;

    private Publisher jobAgency;

    public Company(String companyName, int maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(String vacancyName){
        int salary = random.nextInt(3000, maxSalary);
        Vacancy vacancy = new Vacancy(vacancyName, salary);
        jobAgency.sendOffer(companyName, vacancy);
    }


}
