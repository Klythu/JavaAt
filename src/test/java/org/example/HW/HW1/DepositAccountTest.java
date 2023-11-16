package org.example.HW.HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DepositAccountTest {

    @Test
    void take() {
        DepositAccount TestObject=new DepositAccount(100, 1,1,1);
        TestObject.take(30);
        Assertions.assertEquals(70,TestObject.getAmount());
    }
    @Test
    void take2(){
        DepositAccount TestObject=new DepositAccount(100, 1,1,1);
        TestObject.take(30);
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                TestObject.take(30);
            }
        });
    }
}