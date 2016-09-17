package ATM;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by castro on 9/16/16.
 */
public class BankAccount{


    protected int balance;



    protected ALLENUMD.AccountStatus OpenClosedOrFrozen;
    protected static int accountNumber=1;
    protected int accountCounter;
    protected String accountHolderName;
    protected int IntrestRate;


private BankAccount(String accountHolderName,ALLENUMD savingCheckingOrInvesment){




 OpenClosedOrFrozen= ALLENUMD.AccountStatus.OPEN;
    accountNumber=accountNumber++;
}




    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountCounter() {
        return accountCounter;
    }

    public void setAccountCounter(int accountCounter) {
        this.accountCounter = accountCounter;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getIntrestRate() {
        return IntrestRate;
    }

    public void setIntrestRate(int intrestRate) {
        IntrestRate = intrestRate;
    }


    public ALLENUMD.AccountStatus getOpenClosedOrFrozen() {
        return OpenClosedOrFrozen;
    }

    public void setOpenClosedOrFrozen(ALLENUMD.AccountStatus openClosedOrFrozen) {
        OpenClosedOrFrozen = openClosedOrFrozen;
    }
}
