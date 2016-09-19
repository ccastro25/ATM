package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class Display {




    private String welcomeMessage = "Welcome to BankFidel ";
    private String fullName = "Enter your fullName";
    private String usernameMessage = "Please enter your UserName ";
    private String passwordMessage = "Please enter your Password ";
    private String secondpasswordMessage = "Please enter your Reenter Password ";
    private String typeOfAccountToOpen = "what type of acount do you want ot open";
    private String accessGrantedorDenied ="your acces has been ";
    private String accountHasbeenOpenClosedOrFrozen = "Your account has been...";
    private String checkAllBalanceMessage = "Would you like to Check all of your Accounts ";
    private String transactionTypeMessage ="Your account has been...in this amount ";
    private String balanceMessage = "Your remaining Balance is...";
    private String accountChoice = "Please choose an account, to pick savings enter 1, to pick checking enter 2, to pick investment enter 3 ";
    private String accountTransaction = "Do you want to Check Balance enter 8, Make a transfer enter 7, ";
    private String exitOrGoback = "Enter 9 to the last window, 0 to exit ";
    private String moneySign = " $";




    public void welcomeMessage(){System.out.println(welcomeMessage);}
    public void enterfullNameMessage(){System.out.println(fullName);}
    public void usernameMessage(){System.out.println(usernameMessage);}
    public void userPassswordMessage(){System.out.println(passwordMessage);}
    public void seconduserPassswordMessage(){System.out.println(secondpasswordMessage);}
    public void accessGrantedorDeniedMessage(AllEnums.TransactionAprovedorDenied approvedOrDenied){System.out.println(accessGrantedorDenied +approvedOrDenied);}
    public void accountStatusMessage(AllEnums.AccountOpenClosedOrFrozen openClosedOrFrozen){System.out.println(accountHasbeenOpenClosedOrFrozen+openClosedOrFrozen);}
    public void checkAllBanlancesMessage(){System.out.println(checkAllBalanceMessage);}
    public void AcountHasBeenDebitedOrCreditedMessage(AllEnums.CreditedOrDebited creditedOrDebited, double amount){System.out.println(transactionTypeMessage+creditedOrDebited+moneySign+amount);}
    public void BalanceMessage(double amount){System.out.println(balanceMessage+moneySign+amount);}
    public void accountChoiceDMessage(){System.out.println(accountChoice);}
    public void setAccountTransactionMessage(){System.out.println(accountTransaction);}
    public void setExitOrGobackMessage(){System.out.println(exitOrGoback);}
   // public void (){System.out.println(typeOfAccountToOpen);}
   // public void (){System.out.println();}
}
