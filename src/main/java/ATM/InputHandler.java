package ATM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by castro on 9/17/16.
 */
public  class InputHandler {


    Scanner scanner = new Scanner(System.in);
    private HashMap<String,ArrayList<Object>> userNameAndAccounts= new HashMap<String, ArrayList<Object>>();
    private double openingBalance=100;
    private User user = new User();
    private UserManager userManager = new UserManager();
    private AllEnums.TransactionAprovedorDenied apporvedOrDenied;
    private String fullName;



   private Display display = new Display();

   private ScannerInputHandler scannerInputHandler = new ScannerInputHandler();



    public void start(){

        welcomeMessage();
        userNameProcess();
        createAccounts();

    }


    public void welcomeMessage(){
    display.enterfullNameMessage();
    scannerInputHandler.setUserStringCanHaveSpaces();
    fullName = scannerInputHandler.getUserINput();
}

public void userNameProcess(){
    display.usernameMessage();
    scannerInputHandler.setUserStringNOSpaces();
    user.setUsername(scannerInputHandler.getUserStringInput());;
    user.setPassword(usersPassword());
    userManager.setUserNameAndPassword(user,user);
}

public String  usersPassword(){
    display.userPassswordMessage();
    scannerInputHandler.setUserStringNOSpaces();
    return  scannerInputHandler.getUserINput();

}

public void createAccounts(){
    BankAccount saving = new BankAccount(fullName,AllEnums.AccounType.SAVING,openingBalance);
    BankAccount checking = new BankAccount(fullName, AllEnums.AccounType.CHECKING,openingBalance);
    BankAccount investing = new BankAccount(fullName, AllEnums.AccounType.INVESTMENT,openingBalance);

    ArrayList<Object> accounts = new ArrayList<Object>();
    accounts.add(saving);
    accounts.add(checking);
    accounts.add(investing);
    userNameAndAccounts.put(fullName,accounts);}


public void createLinkToAccountsAndUser(){



}





}





