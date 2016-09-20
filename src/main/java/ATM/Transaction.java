package ATM;

import sun.awt.FullScreenCapable;

import java.util.ArrayList;
import java.util.HashMap;

import static ATM.AllEnums.*;

/**
 * Created by castro on 9/16/16.
 */


public class Transaction {


    private int transactionID;
    private TransactionAprovedorDenied transactionAprovedorDenied;
    private double amount;


    public TransactionAprovedorDenied debit(BankAccount bankAccount, double amountToSubtract) {

        if (amountToSubtract <= bankAccount.getBalance()) {
            amount = bankAccount.getBalance() - amountToSubtract;
            bankAccount.setBalance(amount);
            transactionAprovedorDenied = TransactionAprovedorDenied.APPROVED;
        } else {
            transactionAprovedorDenied = TransactionAprovedorDenied.DENIED;
        }

        return transactionAprovedorDenied;
    }





    public AllEnums.TransactionAprovedorDenied credit(BankAccount bankAccount, double amountToAdd) {


        if ((amountToAdd > 0) & (bankAccount.getBalance() >= amountToAdd)) {

            amountToAdd = bankAccount.getBalance() + amountToAdd;
            bankAccount.setBalance(amountToAdd);
            transactionAprovedorDenied = TransactionAprovedorDenied.APPROVED;
        } else {
            transactionAprovedorDenied = TransactionAprovedorDenied.DENIED;

        }


        return transactionAprovedorDenied;
    }

    public AllEnums.TransactionAprovedorDenied transfer(BankAccount removeFormbankAccount, BankAccount addTobankAccount, double amount) {


        if (debit(removeFormbankAccount, amount) == TransactionAprovedorDenied.APPROVED && amount>0) {
            debit(removeFormbankAccount, amount);
            credit(addTobankAccount, amount);
            transactionAprovedorDenied = TransactionAprovedorDenied.APPROVED;
        } else {
            transactionAprovedorDenied = TransactionAprovedorDenied.DENIED;
        }

        return transactionAprovedorDenied;
    }


}
