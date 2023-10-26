package org.example;

import org.example.HW.HW1.*;
import org.example.HW.HW2.*;
import org.example.HW.HW3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook n = new PhoneBook();
        n.addNumber("oi", "777");
        n.addNumber("oi", "72");
        n.addNumber("oi", "75");
        n.addNumber("oi", "88");
        n.addNumber("op", "12");
        n.addNumber("op", "12");

        n.addNumber("on", "998");
        n.printBook();
        DepositAccount Al = new DepositAccount(0, 10, 1, 1);
        Al.put(10);
        Al.take(3);
        System.out.println(Al.getAmount());
        CreditAccount Bl = new CreditAccount();
        Bl.put(15);
        Bl.take(5);
        System.out.println(Bl.getAmount());

        FixedAmountAccount1 oleg = new FixedAmountAccount1(256);
        oleg.put(200);
        oleg.take(13);
        System.out.println(oleg.getAmount());
        FixedAmountAccount igor = new FixedAmountAccount(130);
        igor.put(12);
        igor.take(1);
        System.out.println(igor.getAmount());

        List<Employee> firm = new ArrayList<>(20);
        Employee e1 = new Employee("Jon", 54, 197.0, "Administration");
        Employee e2 = new Employee("Dick", 52, 158.0, "Lawer");
        Employee e3 = new Employee("Bob", 88, 102.3, "Logistic");
        Employee e4 = new Employee("Albert", 101, 200.2, "Administration");
        Employee e5 = new Employee("Inessa", 64, 400.1, "Lawer");
        Employee e6 = new Employee("Robert", 78, 170.5, "Logistic");
        Employee e7 = new Employee("Anna", 84, 107.8, "Administration");
        Employee e8 = new Employee("Viktor", 61, 130.3, "Logistic");
        Employee e9 = new Employee("Viktoria", 51, 150.3, "Logistic");
        Employee e10 = new Employee("Stuart", 55, 108.6, "Lawer");
        Employee e11 = new Employee("Elis", 53, 109.5, "Administration");
        Employee e12 = new Employee("Maria", 54, 105.7, "Logistic");
        Employee e13 = new Employee("Tom", 52, 85.5, "Lawer");
        Employee e14 = new Employee("Stiv", 55, 60.1, "Promotion");
        Employee e15 = new Employee("Tereza", 66, 80.2, "Lawer");
        Employee e16 = new Employee("May", 64, 120.1, "Logistic");
        Employee e17 = new Employee("Fines", 69, 120.4, "Promotion");
        Employee e18 = new Employee("Feb", 75, 150.5, "Promotion");
        Employee e19 = new Employee("Galina", 84, 110.2, "Promotion");
        Employee e20 = new Employee("Pit", 20, 103.5, "Logistic");

        firm.add(e1);
        firm.add(e2);
        firm.add(e3);
        firm.add(e4);
        firm.add(e5);
        firm.add(e6);
        firm.add(e7);
        firm.add(e8);
        firm.add(e9);
        firm.add(e10);
        firm.add(e11);
        firm.add(e12);
        firm.add(e13);
        firm.add(e14);
        firm.add(e15);
        firm.add(e16);
        firm.add(e17);
        firm.add(e18);
        firm.add(e19);
        firm.add(e20);
        System.out.println("Departments");
        firm.sort(Employee::compareTo);
        for (Employee emp:firm
             ) {emp.show();
        }
        System.out.println("age");
        firm.sort((eo,en)->Integer.compare(eo.age,en.age));
        for (Employee emp:firm
        ) {emp.show();
        }
        System.out.println("salary");
        firm.sort((eo,en)->Double.compare(en.salary,eo.salary));
        for (Employee emp:firm
        ) {emp.show();
        }
    }
}