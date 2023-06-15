package lesson33.task2;

import java.util.Comparator;

public class ageSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o2.age, o1.age);
        if (res == 0){
            return Double.compare(o2.salary, o1.salary);
        }
        return res;
    }
}
