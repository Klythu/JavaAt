package org.example.HW.HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void put() {
        Account TestObject= new Account();
        TestObject.put(100);
        Assertions.assertEquals(100,TestObject.getAmount());
    }

    @Test
    void take() {
        Account TestObject= new Account();
        TestObject.put(100);
        TestObject.take(30);
        Assertions.assertEquals(70,TestObject.getAmount());
    }
}