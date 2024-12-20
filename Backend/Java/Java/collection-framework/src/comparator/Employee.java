package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {

    int id;
    String name;
    int age;

    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}

class Test1{
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 24),
                new Employee(2, "Bob", 30),
                new Employee(3, "Charlie", 22)
        );

        // Comparator to sort by age using lambda expression
        Comparator<Employee> ageComparator = (e1, e2) -> Integer.compare(e1.age, e2.age);

        Collections.sort(employees, ageComparator);
        System.out.println("Sorted by age: " + employees);
    }

}
