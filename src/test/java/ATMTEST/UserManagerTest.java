package ATMTEST;

import ATM.AllEnums;
import ATM.User;
import ATM.UserManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by castro on 9/19/16.
 */
public class UserManagerTest {
    UserManager userManager = new UserManager();
    User user = new User();


    @Test
    public void userNameAndPasswordTest() {

        HashMap<String, String> testingUsernameAndPassword = new HashMap<String, String>();
        testingUsernameAndPassword.put("Crank", "Coder");
        user.setUsername("Crank");
        user.setPassword("Coder");
        userManager.setUserNameAndPassword(user, user);
        HashMap<String, String> actual = userManager.getUserNameAndPassword();

        Assert.assertEquals("expecting Username Crank and Password Coder",testingUsernameAndPassword, actual);

    }
    @Test
    public void setOpenCloseFrozenTest(){
        userManager.setOpenCloseFrozen(AllEnums.AccountOpenClosedOrFrozen.OPEN);
        AllEnums.AccountOpenClosedOrFrozen expected = AllEnums.AccountOpenClosedOrFrozen.OPEN;
        AllEnums.AccountOpenClosedOrFrozen actual = userManager.getOpenCloseFrozen();
        Assert.assertEquals("Expecting account status to be Open", expected, actual);
    }
    @Test
    public void accountType(){
        userManager.setAccountType(AllEnums.AccounType.SAVING);
        AllEnums.AccounType expected = AllEnums.AccounType.SAVING;
        AllEnums.AccounType actual = userManager.getAccountType();
        Assert.assertEquals("Expecting Savings status", expected, actual);
    }

}
