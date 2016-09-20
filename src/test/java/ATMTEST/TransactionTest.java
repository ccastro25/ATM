package ATMTEST;

import ATM.AllEnums;
import ATM.BankAccount;
import ATM.Transaction;
import org.junit.Assert;
import  org.junit.Test;

/**
 * Created by castro on 9/17/16.
 */
public class TransactionTest {
Transaction transaction = new Transaction();
BankAccount castroSavingAccount = new BankAccount("Caonabo", AllEnums.AccounType.CHECKING,100);
BankAccount castroChecking = new BankAccount("Caonabo", AllEnums.AccounType.SAVING,200);


@Test
    public void debitTest(){

    AllEnums.TransactionAprovedorDenied expected = AllEnums.TransactionAprovedorDenied.APPROVED;
    AllEnums.TransactionAprovedorDenied acutal = transaction.debit(castroSavingAccount,99);

    Assert.assertEquals("Debit is it approved or denied ",expected,acutal);
}
    @Test
    public void creditTest(){

        AllEnums.TransactionAprovedorDenied expected = AllEnums.TransactionAprovedorDenied.APPROVED;
        AllEnums.TransactionAprovedorDenied acutal = transaction.credit(castroSavingAccount,1);

        Assert.assertEquals("Credit is it approved or denied ",expected,acutal); }

    @Test
    public void TransferTest(){

        transaction.transfer(castroSavingAccount,castroChecking,30);
        AllEnums.TransactionAprovedorDenied expected = AllEnums.TransactionAprovedorDenied.APPROVED;
        AllEnums.TransactionAprovedorDenied acutal =transaction.transfer(castroSavingAccount,castroChecking,-2000);

        Assert.assertEquals("is it approved or denied ",expected,acutal);
    }


}
