package context;

import payments.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    private String currency;

    public PaymentContext(PaymentStrategy paymentStrategy, String currency) {
        this.paymentStrategy = paymentStrategy;
        this.currency = currency;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void pay(double amount) {
        System.out.println("Attempting to pay: " + amount + " in " + currency);

        double fee = paymentStrategy.calculateProcessingFee(amount);
        System.out.println("Processing fee: " + fee);

        if (!paymentStrategy.processPayment(amount)) {
            System.err.println("Payment failed! Retrying...");

            if (!paymentStrategy.processPayment(amount)) {
                System.err.println("Payment failed again! Attempting to switch payment method...");
            } else {
                System.out.println("Payment retry successful.");
            }
        } else {
            System.out.println("Payment successful.");
        }
    }

    public boolean attemptPayment(double amount) {
        System.out.println("Attempting to pay: " + amount + " in " + currency);

        double fee = paymentStrategy.calculateProcessingFee(amount);
        System.out.println("Processing fee: " + fee);

        if (!paymentStrategy.processPayment(amount)) {
            System.err.println("Payment failed.");
            return false;
        } else {
            System.out.println("Payment successful.");
            return true;
        }
    }
}