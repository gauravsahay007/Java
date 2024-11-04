public class TestBankAccount {
    public static void main(String[] args) {
        // Creating a new bank account object
        BankAccount account = new BankAccount("John Doe", 500.00);

        // Accessing the account holder's name (read-only)
        System.out.println("Account Holder: " + account.getAccountHolder());

        // Accessing the balance (read-only)
        System.out.println("Current Balance: $" + account.getBalance());

        // Depositing money
        account.deposit(200.00);
        System.out.println("New Balance: $" + account.getBalance());

        // Trying to withdraw money
        if (account.withdraw(100.00)) {
            System.out.println("Withdrawal successful.");
        }
        System.out.println("Remaining Balance: $" + account.getBalance());

        // Trying to access the private field directly (uncommenting will cause error)
        // account.balance = 1000;  // Error: balance has private access
    }
}