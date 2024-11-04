// Another class implementing the Payment interface
class CashPayment implements Payment {
    public static void main(String[] args){};
    
    public void makePayment(double amount) {
        System.out.println("Cash payment of $" + amount + " made.");
    }

    // Overriding the default method
    public void showTransactionDetails(String transactionId) {
        System.out.println("Cash Payment - Transaction ID: " + transactionId);
    }
}