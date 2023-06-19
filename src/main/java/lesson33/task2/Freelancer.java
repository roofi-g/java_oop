package lesson33.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    private int totalHours;

    public Freelancer(String name, String surname, int age, double salary, int totalHours) {
        super(name, surname, age, salary);
        this.totalHours = totalHours;
    }

    @Override
    public double calculateSalary() {
        return totalHours * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата (почасовая ставка): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
