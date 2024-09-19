package payments;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount, String currency) {
        System.out.println("Processing PayPal payment of " + convertCurrency(amount, currency) + " " + currency);
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.03;
    }

    @Override
    public boolean processPayment(double amount) {
        return Math.random() > 0.2;
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
