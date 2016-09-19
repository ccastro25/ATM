package ATM;

import java.util.HashMap;

/**
 * Created by castro on 9/16/16.
 */
public class UserManager {

    private HashMap<String, String> userNameAndPassword = new HashMap<String, String>();

    private AllEnums.AccountOpenClosedOrFrozen accountOpenCloseFrozen;

    private AllEnums.AccounType accountType;

    public UserManager(){
    }

    public void setUserNameAndPassword(User userName, User password){
        userNameAndPassword.put(userName.getUsername(), password.getPassword());
    }
    public HashMap<String, String> getUserNameAndPassword(){
        return userNameAndPassword;
    }
    public void setOpenCloseFrozen(AllEnums.AccountOpenClosedOrFrozen accountOpenCloseFrozen){
        this.accountOpenCloseFrozen = accountOpenCloseFrozen;
    }
    public AllEnums.AccountOpenClosedOrFrozen getOpenCloseFrozen(){
        return accountOpenCloseFrozen;
    }
    public void setAccountType(AllEnums.AccounType accountType) {
        this.accountType = accountType;
    }
    public AllEnums.AccounType getAccountType(){
        return accountType;
    }


}





