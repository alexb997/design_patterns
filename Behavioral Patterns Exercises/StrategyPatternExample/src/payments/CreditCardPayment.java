package payments;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) throws PaymentException {
        double fee = calculateProcessingFee(amount);
        System.out.println("Processing Credit Card payment of " + amount + " with fee: " + fee);
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.02;
    }
}