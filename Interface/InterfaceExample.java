public class InterfaceExample {
    public static void main(String[] args) {
        // Using CreditCardPayment class
        Payment creditCard = new CreditCardPayment();
        creditCard.makePayment(150.75);
        creditCard.showTransactionDetails("TXN12345");
        creditCard.logPayment();  // Calls the default logPayment() method

        // Using CashPayment class
        Payment cash = new CashPayment();
        cash.makePayment(50.0);
        cash.showTransactionDetails("TXN54321");

        // Calling static method from the interface
        Payment.paymentInstructions();
    }
}

