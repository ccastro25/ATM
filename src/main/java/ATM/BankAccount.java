package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class BankAccount{


    private double balance;



    private AllEnums.AccountStatus OpenClosedOrFrozen;
    private int accountNumber;
    private static int accountCounter;
    private String accountHolderName;
    private int IntrestRate;


public BankAccount(String accountHolderName, AllEnums savingCheckingOrInvesment){




 OpenClosedOrFrozen= AllEnums.AccountStatus.OPEN;
    accountNumber=accountNumber++;
}




    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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


    public AllEnums.AccountStatus getOpenClosedOrFrozen() {
        return OpenClosedOrFrozen;
    }

    public void setOpenClosedOrFrozen(AllEnums.AccountStatus openClosedOrFrozen) {
        OpenClosedOrFrozen = openClosedOrFrozen;
    }
}
