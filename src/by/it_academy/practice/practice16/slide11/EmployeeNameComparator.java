package by.it_academy.practice.practice16.slide11;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}