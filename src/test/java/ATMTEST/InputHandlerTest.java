package ATMTEST;

import ATM.AllEnums;
import ATM.BankAccount;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 9/18/16.
 */
public class InputHandlerTest {
    private HashMap<String,ArrayList<Object>> userNameAndAccounts= new HashMap<String, ArrayList<Object>>();


    @Test
    public void createAccountTest()
    {
        BankAccount saving = new BankAccount("castro", AllEnums.AccounType.SAVING,100);
        BankAccount checking = new BankAccount("castro", AllEnums.AccounType.CHECKING,100);
        BankAccount investing = new BankAccount("castro", AllEnums.AccounType.INVESTMENT,100);

        ArrayList<Object> accounts = new ArrayList<Object>();
        accounts.add(saving);
        accounts.add(checking);
        accounts.add(investing);
        userNameAndAccounts.put("castro",accounts);
        ArrayList one= userNameAndAccounts.get("castro");
        BankAccount example = (BankAccount) one.get(1);
        double expected = 2.1;
        double actual = example.getAccountIntrest();

        Assert.assertEquals("not sure what it will return",expected, actual,0.1);

    }




}
