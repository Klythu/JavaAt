package org.example;

import org.example.HW.HW1.*;
public class Main {
    public static void main(String[] args) {
        PhoneBook n=new PhoneBook();
        n.addNumber("oi","777");
        n.addNumber("oi","72");
        n.addNumber("oi","75");
        n.addNumber("oi","88");
        n.addNumber("op","12");
        n.addNumber("op","12");

        n.addNumber("on","998");
        n.printBook();
        DepositAccount Al=new DepositAccount(0,10,1,1);
        Al.put(10);
        Al.take(3);
        System.out.println(Al.getAmount());
        CreditAccount Bl=new CreditAccount();
        Bl.put(15);
        Bl.take(5);
        System.out.println(Bl.getAmount());

    }
}