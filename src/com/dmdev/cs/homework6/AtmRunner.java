package com.dmdev.homework6;

public class AtmRunner {
    public static void main(String[] args) {

        ATM atm1 = new ATM(500, 1000, 10000);
        Deposit deposit = new Deposit(1000);
        Cash cashMoney = new Cash(10840);
        atm1.addMoney(deposit);
        System.out.println(atm1.possibilityWithdrawal(cashMoney));
        atm1.print(cashMoney);
    }
}
