package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class App {

    public static void main(String[] args) {

        Display display = new Display();
       Bank inputHandler =new Bank();
        display.welcomeMessage();
        inputHandler.start();
    }
}
