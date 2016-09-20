package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class BankAccount{

   private AllEnums.AccountOpenClosedOrFrozen accountOpenClosedOrFrozen;
   private AllEnums.AccounType savingCheckingOrInvesment;

    private double balance;
    private int accountNumber;
    private static int accountCounter=0;
    private String accountHolderName;
    private double checkingIntrestRate = 2.3;
    private double savingIntrestRate = 2.1;
    private double investmentIntrestRate = 2.1;
    private double accountIntrest;

    public AllEnums.AccounType getSavingCheckingOrInvesment() {
        return savingCheckingOrInvesment;
    }

    public void setSavingCheckingOrInvesment(AllEnums.AccounType savingCheckingOrInvesment) {
        this.savingCheckingOrInvesment = savingCheckingOrInvesment;
    }

    public BankAccount(String accountHolderName, AllEnums.AccounType savingCheckingOrInvesment, double balance){

    if (savingCheckingOrInvesment.equals(AllEnums.AccounType.SAVING))
        {accountIntrest= savingIntrestRate;
            savingCheckingOrInvesment = AllEnums.AccounType.SAVING;}

            else if( savingCheckingOrInvesment.equals(AllEnums.AccounType.CHECKING))
       { accountIntrest =checkingIntrestRate;
            savingCheckingOrInvesment = AllEnums.AccounType.CHECKING;}

          else if (savingCheckingOrInvesment.equals(AllEnums.AccounType.SAVING))
         { accountIntrest= investmentIntrestRate;
             savingCheckingOrInvesment = AllEnums.AccounType.INVESTMENT;}


    this.balance= balance;
    this.accountHolderName =accountHolderName;
    this.savingCheckingOrInvesment = savingCheckingOrInvesment;
    accountOpenClosedOrFrozen= AllEnums.AccountOpenClosedOrFrozen.OPEN;
   accountNumber= accountCounter++;
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


    public double getAccountIntrest() {
        return accountIntrest;
    }

    public AllEnums.AccountOpenClosedOrFrozen getOpenClosedOrFrozen() {
        return accountOpenClosedOrFrozen;
    }

    public void setOpenClosedOrFrozen(AllEnums.AccountOpenClosedOrFrozen openClosedOrFrozen) {
        accountOpenClosedOrFrozen = openClosedOrFrozen;
    }

    public AllEnums.AccounType getAccountType() {
        return savingCheckingOrInvesment;
    }

}
