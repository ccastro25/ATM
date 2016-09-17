package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class Bank {
    private UserManager userManger = new UserManager();
    private AccountManager accountManager = new AccountManager();
    private TransactionManager transactionManger = new TransactionManager();
    private InputHander inputHander = new InputHander();

    private ALLENUMD allenumd;

    public UserManager getUserManger() {
        return userManger;
    }

    public void setUserManger(UserManager userManger) {
        this.userManger = userManger;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public TransactionManager getTransactionManger() {
        return transactionManger;
    }

    public void setTransactionManger(TransactionManager transactionManger) {
        this.transactionManger = transactionManger;
    }

    public InputHander getInputHander() {
        return inputHander;
    }

    public void setInputHander(InputHander inputHander) {
        this.inputHander = inputHander;
    }
}
