package payments;

public class BitcoinPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) throws PaymentException {
        double fee = calculateProcessingFee(amount);
        System.out.println("Processing Bitcoin payment of " + amount + " with fee: " + fee);
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.01;
    }
}
