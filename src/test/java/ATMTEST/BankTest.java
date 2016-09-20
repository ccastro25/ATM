package ATMTEST;

import ATM.AllEnums;
import ATM.Bank;
import ATM.BankAccount;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Created by castro on 9/19/16.
 */
public class BankTest {
Bank bank =new Bank();
  BankAccount bankAccount = new BankAccount("castro", AllEnums.AccounType.CHECKING,234);
    private HashMap<String, ArrayList<Object>> userNameAndAccounts = new HashMap<String, ArrayList<Object>>();
    ArrayList<Object> accounts = new ArrayList<>();

    @Test
    public  void createAccountTest(){
        BankAccount account = bank.createAccounts("castro", AllEnums.AccounType.SAVING,100);
        accounts.add(account);

        String expected = "castro";
        String actual= account.getAccountHolderName();

        Assert.assertEquals("expecting users name",expected,actual);

    }
    @Test
    public void createLinkToAccountsAndUser(){

        BankAccount saving = bank.createAccounts("castro", AllEnums.AccounType.SAVING,100);
        BankAccount checking = bank.createAccounts("castro", AllEnums.AccounType.CHECKING,100);
        BankAccount investment = bank.createAccounts("castro", AllEnums.AccounType.INVESTMENT,100);

        BankAccount[] allacounts = {saving,checking,investment};

        for (BankAccount b:allacounts) {


            if (userNameAndAccounts.containsKey("castro")) {accounts.add(b);}
            else {accounts.add(b);
                userNameAndAccounts.put("castro", accounts);}
        }

        int expected = 3;
        int actual =userNameAndAccounts.get("castro").size();
        Assert.assertEquals("not sure what it will return",expected, actual,0.1);

        }
@Test
 public void choosingAcountTypeTest(){

     AllEnums.AccounType expect = AllEnums.AccounType.SAVING;
     AllEnums.AccounType actual =bank.choosingAcountType(1);


     Assert.assertEquals("should return saving account ",expect,actual);
 }

    }



