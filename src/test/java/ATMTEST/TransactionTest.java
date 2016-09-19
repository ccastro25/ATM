package ATMTEST;

import ATM.AllEnums;
import ATM.Transaction;
import org.junit.Assert;
import  org.junit.Test;

/**
 * Created by castro on 9/17/16.
 */
public class TransactionTest {
Transaction transaction = new Transaction(110, AllEnums.CreditedOrDebited.CREDITED);
@Test
    public void debitTest(){

    AllEnums.TransactionAprovedorDenied expected = AllEnums.TransactionAprovedorDenied.APPROVED;
    AllEnums.TransactionAprovedorDenied acutal = transaction.getApprovedorDenied();

    Assert.assertEquals("is it approved or denied ",expected,acutal);
}
    public void creditTest(){

        AllEnums.TransactionAprovedorDenied expected = AllEnums.TransactionAprovedorDenied.APPROVED;
        AllEnums.TransactionAprovedorDenied acutal = transaction.getApprovedorDenied();

        Assert.assertEquals("is it approved or denied ",expected,acutal); }


    public void TransferTest(){
        AllEnums.TransactionAprovedorDenied expected = AllEnums.TransactionAprovedorDenied.APPROVED;
        AllEnums.TransactionAprovedorDenied acutal = transaction.getApprovedorDenied();

        Assert.assertEquals("is it approved or denied ",expected,acutal);
    }



}
