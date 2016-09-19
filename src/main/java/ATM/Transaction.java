package ATM;

/**
 * Created by castro on 9/16/16.
 */


public class Transaction {



    private double amount;
    private double balanceAfterTransaction;
    private static int trantionID;
    private AllEnums.AccounType transactionType;
    private AllEnums.TransactionAprovedorDenied approvedorDenied;




public Transaction(double amount, AllEnums.AccounType transactionTypes){

    this.amount = amount;
    this.transactionType = transactionTypes;

}

    public double getAccount() {
        return amount;
    }

    public void setAccount(int account) {
        this.amount = account;
    }

    public int getTrantionID() {
        return trantionID;
    }

    public void setTrantionID(int trantionID) {
        this.trantionID = trantionID;
    }




}
