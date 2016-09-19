package ATMTEST;

import ATM.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/18/16.
 */
public class UserTest {
 User user = new User();

    @Test
    public void userTest(){
        user.setUsername("Crank");
        String expected = "Crank";
        String actual = user.getUsername();

        Assert.assertEquals("Expecting Crank as username", expected, actual);
    }
    @Test
    public void passwordTest(){
        user.setPassword("Coder");
        String expected = "Coder";
        String actual = user.getPassword();

        Assert.assertEquals("Expecting Crank as username", expected, actual);
    }

}
