package lesson33.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(20, 50);
        int employeeType = random.nextInt(0, 2);
        if (employeeType == 0) {
            int workerSalary = random.nextInt(20000, 80000);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, workerSalary);
        }
        int freelancerSalary = random.nextInt(1000, 2000);
        int totalHours = random.nextInt(5, 8) * 20;
        return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, freelancerSalary, totalHours);
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

//        Arrays.sort(employees, new SalaryComparator());
//        Arrays.sort(employees, new nameSurnameComparator()); // по фамилии + имени
        Arrays.sort(employees, new ageSalaryComparator()); // по возрасту + уровню зп.

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
