package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class Bank {
    private UserManager userManger = new UserManager();
    private AccountManager accountManager = new AccountManager();
    private TransactionManager transactionManger = new TransactionManager();




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





}
