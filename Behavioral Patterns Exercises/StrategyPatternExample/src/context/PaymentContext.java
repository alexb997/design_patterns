package context;

import payments.CreditCardPayment;
import payments.CurrencyConverter;
import payments.Discount;
import payments.PaymentException;
import payments.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    private Discount discount;
    private String preferredCurrency;

    public PaymentContext(PaymentStrategy paymentStrategy, Discount discount, String preferredCurrency) {
        this.paymentStrategy = paymentStrategy;
        this.discount = discount;
        this.preferredCurrency = preferredCurrency;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPreferredCurrency(String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }

    public void processPayment(double amount) throws PaymentException {
        double discountedAmount = discount.applyDiscount(amount);
        double convertedAmount = CurrencyConverter.convertToPreferredCurrency(discountedAmount, preferredCurrency);
        try {
            paymentStrategy.processPayment(convertedAmount);
        } catch (PaymentException e) {
            System.out.println("Payment failed: " + e.getMessage());
            System.out.println("Retrying payment with same method...");
            try {
                paymentStrategy.processPayment(convertedAmount);
            } catch (PaymentException retryException) {
                System.out.println("Retry failed. Switching to backup payment method...");
                setPaymentStrategy(new CreditCardPayment());
                paymentStrategy.processPayment(convertedAmount);
            }
        }
    }
}
