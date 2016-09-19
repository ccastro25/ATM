package ATM;

/**
 * Created by castro on 9/16/16.
 */


public class Transaction {



    private double amount;
    private double balanceAfterTransaction;
    private static int trantionID;
    private AllEnums.CreditedOrDebited creditedOrDebited;
    private AllEnums.TransactionAprovedorDenied approvedorDenied;


    public AllEnums.CreditedOrDebited getCreditedOrDebited() {
        return creditedOrDebited;
    }

    public AllEnums.TransactionAprovedorDenied getApprovedorDenied() {
        return approvedorDenied;
    }

    public Transaction(double amount, AllEnums.CreditedOrDebited creditedOrDebited){

    this.amount = amount;
    this.creditedOrDebited = creditedOrDebited;

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


public AllEnums.TransactionAprovedorDenied debit(){

    return null;

}


public AllEnums.TransactionAprovedorDenied credit(){


    return null;
}

public AllEnums.TransactionAprovedorDenied transfer(){


    return null;
}


}
