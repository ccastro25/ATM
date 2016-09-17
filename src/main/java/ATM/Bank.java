package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class Bank {
    private UserManager userManger = new UserManager();
    private AccountManager accountManager = new AccountManager();
    private TransactionManager transactionManger = new TransactionManager();
    private double checkingIntrestRate = 2.3;
    private double savingIntrestRate = 2.1;
    private double InvestmentIntrestRate = 2.1;



    private AllEnums allenumd;

    public UserManager getUserManger() {
        return userManger;
    }


    public AccountManager getAccountManager() {
        return accountManager;
    }


    public TransactionManager getTransactionManger() {
        return transactionManger;
    }



    public double getCheckingIntrestRate() {
        return checkingIntrestRate;
    }

    public double getSavingIntrestRate() {
        return savingIntrestRate;
    }

    public double getInvestmentIntrestRate() {
        return InvestmentIntrestRate;
    }

}
