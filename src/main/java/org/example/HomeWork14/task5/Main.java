package org.example.HomeWork14.task5;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
@Log
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Anton", 23000));
        employees.add(new Employee("Victor", 68500));
        employees.add(new Employee("Ivan", 48900));
        employees.add(new Employee("Boris", 55300));

        log.info("Сортировка сотрудников по имени человека: ");
        Collections.sort(employees);
        for (Employee employee : employees) {
            log.info("Работник: " + employee);
        }

        log.info("\nСортировка сотрудников с компаратором: ");
        Collections.sort(employees, new EmployeeSalaryComparator());
        for (Employee employee : employees) {
            log.info("Работник: " + employee);
        }

        TreeSet<Employee> employeesTreeSet = new TreeSet<>();
        employeesTreeSet.add(new Employee("Anton", 23000));
        employeesTreeSet.add(new Employee("Victor", 68500));
        employeesTreeSet.add(new Employee("Ivan", 48900));
        employeesTreeSet.add(new Employee("Boris", 55300));

        log.info("\nСотрудники TreeSet без компаратора:");
        for (Employee employee : employeesTreeSet) {
            log.info("Работник: " + employee);
        }

        TreeSet<Employee> employeesTreeSetWithComparator = new TreeSet<>(new EmployeeSalaryComparator());
        employeesTreeSetWithComparator.add(new Employee("Anton", 23000));
        employeesTreeSetWithComparator.add(new Employee("Victor", 68500));
        employeesTreeSetWithComparator.add(new Employee("Ivan", 48900));
        employeesTreeSetWithComparator.add(new Employee("Boris", 55300));

        log.info("\nСотрудники TreeSet с компаратором:");
        for (Employee employee : employeesTreeSetWithComparator) {
            log.info("Работник: " + employee);
        }
    }
}
