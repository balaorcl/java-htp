package htp.atm;

public class Account {
    private double balance;// instance variable that stores the balance
    
    // constructor
    public Account(double initialBalance) {
        // validate that initialBalance is greater than 0.0
        // if it is not, balance is initialized to the default value 0.0
        if (initialBalance > 0.0){
            balance = initialBalance;
        }
        
    }
    
    // credit (aad) amount to the account
        
}
