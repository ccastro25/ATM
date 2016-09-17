package ATM;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 9/16/16.
 */
public class TransactionManager  {

    private HashMap<Integer, ArrayList> usersAccounts = new HashMap<Integer, ArrayList>();

       public TransactionManager(){



       }
    public HashMap getTransactionManager(){

        return usersAccounts;


    }


    public void createTransaction(){}

    public int getID(){

        return 0;
    }
}


