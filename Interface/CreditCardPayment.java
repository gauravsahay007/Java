class CreditCardPayment implements Payment{
    public static void main(String[] args){};

    public void makePayment(double amount){
        //using MIN_PAYMENT of the interface
        if (amount < MIN_PAYMENT) {
            System.out.println("Minimum payment amount is: " + MIN_PAYMENT);
        } else {
            System.out.println("Credit Card payment of $" + amount + " made.");
        }
    }
}