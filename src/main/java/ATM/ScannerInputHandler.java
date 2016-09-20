package ATM;

import java.util.Scanner;

/**
 * Created by castro on 9/17/16.
 */
public class ScannerInputHandler {




  private   Scanner scanner = new Scanner(System.in);

    private String userINput;

    private double userDoubleINput;


    public double getUserDoubleINput() {
        return userDoubleINput;
    }

    public void setUserDoubleINput() {
        userDoubleINput = scanner.nextDouble();
    }

    public void setUserStringNOSpaces(){

     userINput = scanner.next();}


     public void setUserStringCanHaveSpaces(){

         userINput = scanner.nextLine();
     }

     public String getUserStringInput(){

      return userINput;
     }




    public String getUserINput() {return userINput;}
}
