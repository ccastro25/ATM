package ATM;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 9/16/16.
 */
public class AccountManager {

protected HashMap<String,ArrayList> accounts = new HashMap<String, ArrayList>();


    public AccountManager(){

    }


    public  HashMap getAccounts(){

        return accounts;
    }
    public  BankAccount getAccount(){

        return null;
    }
    public void closeAccount(){}

    public void openAccountManager(){}



}
