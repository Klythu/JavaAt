package org.example.HW.HW1;


public class CreditAccount extends Account {
    public CreditAccount (double Balance) {
        super(Balance);
    }
    public CreditAccount(){
        super();
    }
        public void take(double number){
            number=1.01*number;
            super.take(number);
        }
    }

