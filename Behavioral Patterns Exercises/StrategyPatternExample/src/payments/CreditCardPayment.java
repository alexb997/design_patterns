package payments;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount, String currency) {
        System.out.println("Processing credit card payment of " + convertCurrency(amount, currency) + " " + currency);
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public boolean processPayment(double amount) {
        return Math.random() > 0.1;
    }

    private double convertCurrency(double amount, String currency) {
        if ("USD".equals(currency)) {
            return amount;
        } else if ("EUR".equals(currency)) {
            return amount * 0.85;
        } else if ("BTC".equals(currency)) {
            return amount * 0.000027;
        }
        return amount;
    }
}