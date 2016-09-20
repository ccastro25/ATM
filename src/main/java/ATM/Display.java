package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class Display {




    private String welcomeMessage = "Welcome to BankFidel ";
    private String fullName = "Enter your fullName";
    private String usernameMessage = "Please enter your UserName ";
    private String passwordMessage = "Please enter your Password ";
    private String typeOAccount = "what type of account would you like make. for saving enter 1, for checking enter 2 and enter 3 for Investment.";
    private String Enterbalance = "Enter your  amount? ";
    private String accessGrantedorDenied ="your access has been ";
    private String accountHasbeenOpenClosedOrFrozen = "Your account has been...";

    private String transactionTypeMessage ="Your account ";
    private String balanceMessage = "Your remaining Balance is...";
    private String accountChoice = "To add a new account enter 1 ";
    private String accountTransaction = "to Check all balances enter 2, to a debit 3 ,to credit enter 4, to transfer enter 5";
    private String exitOrGoback = "Enter 9 to go back to the last options or  0 to exit ";
    private String moneySign = " $";
    private String errorMessage = "Error please try again";




    public void welcomeMessage(){System.out.println(welcomeMessage);}
    public void enterfullNameMessage(){System.out.println(fullName);}
    public void usernameMessage(){System.out.println(usernameMessage);}
    public void userPassswordMessage(){System.out.println(passwordMessage);}
    public void TypeOfAccount(){System.out.println(typeOAccount);}
    public void accessGrantedorDeniedMessage(AllEnums.TransactionAprovedorDenied approvedOrDenied){System.out.println(accessGrantedorDenied +approvedOrDenied);}
    public void accountStatusMessage(AllEnums.AccountOpenClosedOrFrozen openClosedOrFrozen){System.out.println(accountHasbeenOpenClosedOrFrozen+openClosedOrFrozen);}
    public void checkAllBanlancesMessage(){System.out.println();}
    public void AcountHasBeenDebitedOrCreditedMessage(AllEnums.CreditedOrDebited creditedOrDebited, double amount){System.out.println(transactionTypeMessage+creditedOrDebited+moneySign+amount);}
    public void BalanceMessage(double amount){System.out.println(balanceMessage+moneySign+amount);}
    public void accountChoiceDMessage(){System.out.println(accountChoice);}
    public void getAccountTransactionMessage(){System.out.println(accountTransaction);}
    public void getExitOrGobackMessage(){System.out.println(exitOrGoback);}
    public void ErrorMessage(){System.out.println(errorMessage);}
    public void enterAnAmount(){System.out.println(Enterbalance);}
    public void accountInfoandBalance(){}


    public void accountInfoandBalance(String name, AllEnums.AccountOpenClosedOrFrozen openClosedOrFrozen, int accountNumber,
                          double intrest, AllEnums.AccounType savngCheckingOrIntrest,double balance){
        System.out.println(name +" your "+savngCheckingOrIntrest+ "account number "+accountNumber+" contains "+balance+ " and the account is: "+ openClosedOrFrozen +" and youre interest is: "
        +intrest);
    }

   // public void (){System.out.println();}
}
