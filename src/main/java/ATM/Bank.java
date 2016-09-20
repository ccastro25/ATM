package ATM;

import java.util.ArrayList;
import java.util.HashMap;

import ATM.AllEnums.*;


/**
 * Created by castro on 9/17/16.
 */
public class Bank {

    private AccounType checkingSavingOrInvestementAccount;
    private HashMap<String, ArrayList<Object>> userNameAndAccounts = new HashMap<String, ArrayList<Object>>();
    private double openingBalance = 100;
    private User user = new User();
    private UserManager userManager = new UserManager();
    private AllEnums.TransactionAprovedorDenied apporvedOrDenied;
    private String fullName;
    private double usersDoubleEntry;
    private AccounType accounType;
    private String usersStringInput;
    private ArrayList<Object> accounts = new ArrayList<>();

    private Display display = new Display();

    private ScannerInputHandler scannerInputHandler = new ScannerInputHandler();


    public void start() {

        welcomeMessage();
        userNameProcess();
        usersPassword();
        viewAccounts();


    }


   public void welcomeMessage() {
        display.enterfullNameMessage();
        scannerInputHandler.setUserStringCanHaveSpaces();
        this.fullName = scannerInputHandler.getUserINput();

    }

    public void userNameProcess() {
        display.usernameMessage();
        scannerInputHandler.setUserStringNOSpaces();
        user.setUsername(scannerInputHandler.getUserStringInput());

        user.setPassword(usersPassword());
        userManager.setUserNameAndPassword(user, user);
    }

    public String usersPassword() {
        display.userPassswordMessage();
        scannerInputHandler.setUserStringNOSpaces();
        return scannerInputHandler.getUserINput();

    }

    public BankAccount createAccounts(String fullName, AllEnums.AccounType savingCheckOrInvestment,double amount) {
      BankAccount  account = new BankAccount(fullName,savingCheckOrInvestment,amount);
       createLinkToAccountsAndUser(account);
        return  account;
    }


    public void createLinkToAccountsAndUser(BankAccount account)
    {

        if (userNameAndAccounts.containsKey(fullName)) {
            accounts.add(account);}
        else {accounts.add(account);
            userNameAndAccounts.put(fullName,accounts);}

            display.accessGrantedorDeniedMessage(TransactionAprovedorDenied.APPROVED);
            viewAccounts();

    }

    public void viewAccounts() {
        display.accountChoiceDMessage();
        display.getExitOrGobackMessage();
        display.getAccountTransactionMessage();
        display.checkAllBanlancesMessage();
        scannerInputHandler.setUserDoubleINput();
        usersDoubleEntry = scannerInputHandler.getUserDoubleINput();
        selectingOptions(usersDoubleEntry);
    }


    public void selectingOptions(double usersChoice) {

        while (true) {
            switch ((int)usersChoice) {

                case 0:
                    System.exit(0);

                case 1:
                    option1CreatingNewAccount();
                    break;

                case 2:
                    option2GettingAllBalances();
                    break;
                case 3:
                    break;
                case 4:

                case 5:

                case 9:
                    break;
                default:
                    display.ErrorMessage();

            }

        }


    }


    public AccounType choosingAcountType(double accountType){
            if(accountType==1){
                checkingSavingOrInvestementAccount = AccounType.SAVING;}
           else if (accountType ==2){
                checkingSavingOrInvestementAccount = AccounType.CHECKING;}
            else if(accountType ==3){
                checkingSavingOrInvestementAccount = AccounType.INVESTMENT;}
        return checkingSavingOrInvestementAccount;}

public double startingBalance(){
    display.startingBalance();
    scannerInputHandler.setUserDoubleINput();
    return scannerInputHandler.getUserDoubleINput();
}

public void option1CreatingNewAccount(){
    display.makingATypeOfAccount();
    scannerInputHandler.setUserDoubleINput();
    checkingSavingOrInvestementAccount= choosingAcountType(scannerInputHandler.getUserDoubleINput());
    createAccounts(this.fullName,checkingSavingOrInvestementAccount,startingBalance());
    display.startingBalance();
    scannerInputHandler.setUserDoubleINput();
    usersDoubleEntry = scannerInputHandler.getUserDoubleINput();
    createAccounts(fullName,accounType, usersDoubleEntry);


}

public void option2GettingAllBalances(){
BankAccount account;


     int count =0;
    int test =accounts.size();
while(count<test) {

 account= (BankAccount)userNameAndAccounts.get(this.fullName).get(count);


    display.accountInfoandBalance(account.getAccountHolderName(),account.getOpenClosedOrFrozen(),
            account.getBalance(),account.getSavingCheckingOrInvesment(),account.getAccountIntrest() );
    count++;
System.out.println(count+"  "+test);

}


viewAccounts();

    }




}










