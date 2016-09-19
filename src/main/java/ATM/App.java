package ATM;

/**
 * Created by castro on 9/16/16.
 */
public class App {

    public static void main(String[] args) {

        Display display = new Display();
       InputHandler inputHandler =new InputHandler();
        display.welcomeMessage();
        inputHandler.start();
    }
}
