package lesson77.observer;

public class Vacancy {

    private String position;
    private int salary;

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public Vacancy(String position, int salary) {
        this.position = position;
        this.salary = salary;
    }
}
