
// An interface in Java is a contract that 
// defines a set of abstract methods 
// (method signatures) that any class 
// implementing the interface must provide 
// implementations for. 

interface Payment{
    // Abstract method (must be implemented by implementing classes)
    void makePayment(double amount);

    // Static field (public, static, final by default)
    double MIN_PAYMENT = 1.0;

    default void showTransactionDetails(String transactionId){
        System.out.println("Transaction ID:" + transactionId);
    }

    // Static method (belongs to the interface itself)
    static void paymentInstructions(){
        System.out.println("Instructions: Use card, cash, or online payment.");
    }

    // Private method (used for internal logic within the interface)
    private void logTransaction(String message){
        System.out.println("Log: " + message);
    }

    // Default method using private method for internal logic
    default void logPayment() {
        logTransaction("Payment logged successfully.");
    }

}