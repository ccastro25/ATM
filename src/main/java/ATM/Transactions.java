package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class Transactions extends ALLENUMD{



    protected int account;
    protected int balanceAfterTransaction;
    protected static int trantionID;
    protected ALLENUMD.AccounType transactionType;
    protected ALLENUMD.TransactionAprovedorDenied approvedorDenied;





    public double getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getTrantionID() {
        return trantionID;
    }

    public void setTrantionID(int trantionID) {
        this.trantionID = trantionID;
    }



    public ALLENUMD.TransactionAprovedorDenied withraw(BankAccount accountToWithDrawForm,int subtractThisAmount) {


        if (accountToWithDrawForm.getBalance() > subtractThisAmount) {
            accountToWithDrawForm.getAccountNumber();
            balanceAfterTransaction = accountToWithDrawForm.getBalance() - subtractThisAmount;
            accountToWithDrawForm.setBalance(balanceAfterTransaction);
             approvedorDenied = TransactionAprovedorDenied.APPROVED;}

             else {

            approvedorDenied =TransactionAprovedorDenied.DENIED;
        }
          return approvedorDenied;
    }




    protected void deposit(BankAccount accountToAddTo,int ammountToAdd){}

    protected void transfer(){}

}
