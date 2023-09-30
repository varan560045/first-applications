package com.dmdev.homework6;

public class ATM {
    private int bills10;
    private int bills20;
    private int bills50;

    public ATM(int bills10, int bills20, int bills50) {
        this.bills10 = bills10;
        this.bills20 = bills20;
        this.bills50 = bills50;
    }

    public int addMoney(Deposit deposit) {
        bills50 += deposit.getDeposit() / 50;
        bills20 += deposit.getDeposit() % 50 / 20;
        bills10 += deposit.getDeposit() % 50 % 20 / 10;
        return deposit.getDeposit();
    }

    public boolean possibilityWithdrawal(Cash cash) {
        return (bills10 * 10) + (bills20 * 20) + (bills50) >= cash.getCash();
    }

    public void print(Cash amountCash) {
        if (possibilityWithdrawal(amountCash)) {
            bills50 = amountCash.getCash() / 50;
            bills20 = amountCash.getCash() % 50 / 20;
            bills10 = amountCash.getCash() % 50 % 20 / 10;
            System.out.println("Купюры по 50: " + bills50 + " шт.");
            System.out.println("Купюры по 20: " + bills20 + " шт.");
            System.out.println("Купюры по 10: " + bills10 + " шт.");
        } else {
            System.out.println("Недостаточно денег в банкомате");
        }
    }

    public int getBills10() {
        return bills10;
    }

    public void setBills10(int bills10) {
        this.bills10 = bills10;
    }

    public int getBills20() {
        return bills20;
    }

    public void setBills20(int bills20) {
        this.bills20 = bills20;
    }

    public int getBills50() {
        return bills50;
    }

    public void setBills50(int bills50) {
        this.bills50 = bills50;
    }
}
