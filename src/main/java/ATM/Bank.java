package ATM;

import java.util.ArrayList;
import java.util.HashMap;

import ATM.AllEnums.*;


/**
 * Created by castro on 9/17/16.
 */
public class Bank {

    private Transaction transaction = new Transaction();
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
    private double amount;

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

    public BankAccount createAccounts(String fullName, AllEnums.AccounType savingCheckOrInvestment, double amount) {
        BankAccount account = new BankAccount(fullName, savingCheckOrInvestment, amount);
        createLinkToAccountsAndUser(account);
        return account;
    }


    public void createLinkToAccountsAndUser(BankAccount account) {
        if (userNameAndAccounts.get(fullName).size() < 4)

        {
            if (userNameAndAccounts.containsKey(fullName)) {
                accounts.add(account);
            } else {
                accounts.add(account);
                userNameAndAccounts.put(fullName, accounts);
            }

            display.accessGrantedorDeniedMessage(TransactionAprovedorDenied.APPROVED);
            viewAccounts();
        }

        else {display.accessGrantedorDeniedMessage(TransactionAprovedorDenied.DENIED);}
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
            switch ((int) usersChoice) {

                case 0:
                    System.exit(0);

                case 1:
                    option1CreatingNewAccount();
                    break;

                case 2:
                    option2GettingAllBalances();
                    break;
                case 3:
                    display.TypeOfAccount();
                    transaction.debit();
                    break;
                case 4:
                    display.TypeOfAccount();
                    scannerInputHandler.setUserDoubleINput();
                    display.enterAnAmount();
                    amount=  scannerInputHandler.getUserDoubleINput();
                  checkingSavingOrInvestementAccount  =  choosingAcountType(scannerInputHandler.getUserDoubleINput());
                    transaction.credit(checkingSavingOrInvestementAccount,amount);
                    break;
                case 5:
                    break;
                transaction.transfer();
                case 9:
                    break;
                default:
                    display.ErrorMessage();

            }

        }


    }


    public AccounType choosingAcountType(double accountType) {
        if (accountType == 1) {
            checkingSavingOrInvestementAccount = AccounType.SAVING;
        } else if (accountType == 2) {
            checkingSavingOrInvestementAccount = AccounType.CHECKING;
        } else if (accountType == 3) {
            checkingSavingOrInvestementAccount = AccounType.INVESTMENT;
        }
        return checkingSavingOrInvestementAccount;
    }

    public double startingBalance() {
        display.enterAnAmount();
        scannerInputHandler.setUserDoubleINput();
        return scannerInputHandler.getUserDoubleINput();
    }

    public void option1CreatingNewAccount() {
        display.TypeOfAccount();
        scannerInputHandler.setUserDoubleINput();
        checkingSavingOrInvestementAccount = choosingAcountType(scannerInputHandler.getUserDoubleINput());
        createAccounts(this.fullName, checkingSavingOrInvestementAccount, startingBalance());
        display.enterAnAmount();
        scannerInputHandler.setUserDoubleINput();
        usersDoubleEntry = scannerInputHandler.getUserDoubleINput();
        createAccounts(fullName, accounType, usersDoubleEntry);


    }

    public void option2GettingAllBalances() {
        BankAccount account;
        int count = 0;
        int test = accounts.size();
        while (count < test) {

            account = (BankAccount) userNameAndAccounts.get(this.fullName).get(count);


            display.accountInfoandBalance(account.getAccountHolderName(), account.getOpenClosedOrFrozen(), account.getAccountNumber(),
                    account.getBalance(), account.getSavingCheckingOrInvesment(), account.getAccountIntrest());
            count++;}
        viewAccounts();}




    public BankAccount filterThroughtAccounts( HashMap<Object,ArrayList> log,AccounType accounType){
        BankAccount account;
        int count = 0;
        int test = accounts.size();

        while (count < test) {

            account = (BankAccount) userNameAndAccounts.get(this.fullName).get(count);

                if(account.getSavingCheckingOrInvesment().equals(accounType)){

                  return  account = (BankAccount) userNameAndAccounts.get(this.fullName).get(count);

               }

            count++;

        }





    }

}










