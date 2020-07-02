package com.account;

public class Account {
    private int accountBalance;
    private int pin;

    void setPin (int userPin) {
        pin = userPin;
    }

    void depositMoney(int amount) {
        if ( amount > 0 ) accountBalance += amount;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    void withdrawMoney(int amount, int userPin) {
        if (userPin == pin && accountBalance - amount > 999) accountBalance -= amount;
    }
}
