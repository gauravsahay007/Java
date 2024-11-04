public class BankAccount{
    // Private fields (data hiding)
    private String accountHolder;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountHolder, double initialDeposit){
        this.accountHolder = accountHolder;
        if(initialDeposit > 0){
            this.balance = initialDeposit;
        }
        else{
            this.balance = 0;
        }
    }

    // Public getter for accountHolder
    public String getAccountHolder(){
        return accountHolder;
    }

    // Public getter for balance (read-only access to balance)
    public double getBalance(){
        return balance;
    }

     // Public setter with validation for deposit
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit: $" + amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money with validation
    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }

     public static void main(String[] args){};

}

// A tightly encapsulated class is a class where 
// all fields are declared as private, and the data
//  can only be accessed or modified through public 
//  getter and setter methods. This ensures that no 
//  \field is directly accessible from outside the class, 
//  thus maintaining complete control over the class's state.