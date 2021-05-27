package atm;

public class Account {
    private double balance;// instance variable that stores the balance
    
    // constructor
    public Account(double initialBalance){
        // validate initialBalance is greater than 0
        // if it is not, balance initialized to default value 0.0
        
        if (initialBalance > 0.0){
            balance = initialBalance;
        }
    }
    
    // credit (add) an amount to the account
    public void credit(double amount){
        balance = balance + amount;// add amount to balance
    }
    
    // return the account balance
    public double getBalance(){
        return balance;// gives the value of balance to the calling method
    }
    
    
    
}
