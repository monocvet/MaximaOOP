package org.example.HomeWork14.task5;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "name=" + name + " ," +
                " salary=" + salary;
    }
}
