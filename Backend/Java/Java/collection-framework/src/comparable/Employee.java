package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Implement the compareTo method to compare employees based on salary
    @Override
    public int compareTo(Employee o) {
        // Comparison based on salary
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }

    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 25, 50000));
        employees.add(new Employee("Bob", 30, 70000));
        employees.add(new Employee("Charlie", 35, 60000));

        // Sorting employees based on salary (natural order)
        Collections.sort(employees);

        // Displaying sorted employee list
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
