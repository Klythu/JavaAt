package org.example.HW.HW1;


import java.time.LocalDate;

public class DepositAccount extends Account {
    private LocalDate LastTake ;
    private LocalDate Data;

    public DepositAccount(double Balance,int day,int month,int year){
        super(Balance);
        this.LastTake= LocalDate.of(year,month,day);
    }
    public DepositAccount(){
        super();

    }


    public void take(double number){
        if (Data.now().isBefore(LastTake.plusDays(30))){
            throw new IllegalArgumentException("Снятие не доступно");
        }else {
            super.take(number);
            LastTake=Data.now();
        }
    }
}
