package org.example.HW.HW1;

public class Account {
    protected double Balance;
    public Account(double Balance){

        if(Balance<0){
            throw new IllegalArgumentException("Баланс должен быть не меньше ноля");
        }else {
            this.Balance = Balance;
        }
    }
    protected Account(){
        this.Balance=0;
    }
    public void put(double number){
        if (number<0) {
            throw new IllegalArgumentException("Сумма поплнения должна быть положительным");
        }else {
            Balance=Balance+number;
        }

    }
    protected void take(double number){
        if (number<0){
            throw new IllegalArgumentException("Сумма снятия должна быть положительным");
        } else if (Balance-number<0) {
            throw new IllegalArgumentException("Не достаточно средств");

        }else {
            Balance = Balance - number;
        }
    }
    public double getAmount(){

        return (Balance) ;
    }

}
