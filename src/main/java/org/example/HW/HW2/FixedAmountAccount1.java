package org.example.HW.HW2;

public class FixedAmountAccount1 implements Account1{
    Double balance;
    public FixedAmountAccount1(){
        this.balance= 0.0;
    }
    public FixedAmountAccount1(double amount){
        this.balance=amount;
    }

    @Override
    public double getAmount() {
        return balance;
    }

    @Override
    public void put(double amount) {
        if (balance<0){
            throw new IllegalArgumentException("Баланс должен быть положительным");
        }
    }

    @Override
    public void take(double amount) {
        if (amount<0){
            throw new IllegalArgumentException("Сумма должна быть положительной");
        } else if (balance-amount<0) {
            throw new IllegalArgumentException("Не достаточно средств");
        }
    }
}
