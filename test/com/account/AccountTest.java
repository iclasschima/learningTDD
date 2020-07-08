package com.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    void setUp() {
        account = new Account ();
    }

    @AfterEach
    void tearDown () {
    }

    @Test
    void accountObjectIsNotNullTest () {
        assertNotNull(account);
    }

    @Test
    void accountObjectCanReceiveDepositTest () {
        account.depositMoney(2500);
        assertEquals(2500, account.getAccountBalance());

        account.depositMoney(5000);
        assertEquals(7500, account.getAccountBalance());
    }

    @Test
    void accountWillNotTakeNegativeValue () {
        account.depositMoney(5000);
        account.depositMoney(-1500);
        assertEquals(5000, account.getAccountBalance());
    }

//    @Test
//    void accountWillWithdrawCashTest () {
//        account.depositMoney(5000);
//        account.withdrawMoney(1000);
//        assertEquals(4000, account.getAccountBalance());
//    }

    @Test
    void accountWillWithdrawWithPinAndBalanceGreaterThan1000Test () {
        account.depositMoney(5000);
        account.setPin(1234);
        account.withdrawMoney(4000, 1234);
        assertEquals(1000, account.getAccountBalance());
    }

}