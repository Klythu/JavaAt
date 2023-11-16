package org.example.HW.HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void take() {
        CreditAccount TestObgect=new CreditAccount();
        TestObgect.put(100);
        TestObgect.take(10);
        Assertions.assertEquals(89.9,TestObgect.getAmount());
    }
}