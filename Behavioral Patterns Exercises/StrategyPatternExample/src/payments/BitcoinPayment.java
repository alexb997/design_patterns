package payments;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount, String currency) {
        System.out.println("Processing Bitcoin payment of " + convertCurrency(amount, currency) + " " + currency);
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.01;
    }

    @Override
    public boolean processPayment(double amount) {
        return Math.random() > 0.15;
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
