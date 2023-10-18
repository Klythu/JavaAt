package org.example.HW.HW2;

public abstract class AbstractAccount implements Account1{
    Double balance;

    public AbstractAccount(double balance) {
        if (balance<0){
            throw new IllegalArgumentException("Баланс должен быть положительным");
        }else {
            this.balance=balance;
        }
    }
    @Override
    public final double getAmount() {
        return (balance);
    }

    @Override
    public final void put(double amount) {
        if (amount<0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
        doPut(amount);

    }

    @Override
    public final void take(double amount) {
        if (amount<0){
            throw new IllegalArgumentException("Сумма должна быть положительной");
        } else if (balance-amount<0) {
            throw new IllegalArgumentException("Не достаточно средств");
        }
        doTake(amount);
    }
    protected void doTake(double amount){
        balance-=amount;
    }
    protected void doPut(double amount){
        balance+=amount;
    }
}
