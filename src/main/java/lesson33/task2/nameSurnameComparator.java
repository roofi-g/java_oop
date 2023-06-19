package lesson33.task2;

import java.util.Comparator;

public class nameSurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.surname.compareTo(o2.surname);
        if (res == 0){
            return o1.name.compareTo(o2.name);
        }
        return res;
    }
}
