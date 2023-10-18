package org.example.HW.HW2;

public class FixedAmountAccount extends AbstractAccount{

    public FixedAmountAccount(double balance) {
        super(balance);
    }

    @Override
    protected void doTake(double amount) {
        super.doTake(0);
    }

    @Override
    protected void doPut(double amount) {
        super.doPut(0);
    }
}
