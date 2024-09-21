package payments;

public class PayPalPayment implements PaymentStrategy {

    private boolean simulateFailure;

    public PayPalPayment(boolean simulateFailure) {
        this.simulateFailure = simulateFailure;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        double fee = calculateProcessingFee(amount);
        if (simulateFailure) {
            throw new PaymentException("PayPal payment failed");
        }
        System.out.println("Processing PayPal payment of " + amount + " with fee: " + fee);
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.03;
    }
}