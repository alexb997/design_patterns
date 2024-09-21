package payments;

public interface PaymentStrategy {
    void processPayment(double amount) throws PaymentException;
    double calculateProcessingFee(double amount);
}
