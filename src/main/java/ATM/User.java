package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class User {

    private int pin;
    private  static int userId;
    private String accountHoldersName;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String accountHoldersName) {
        this.accountHoldersName = accountHoldersName;
    }
}
