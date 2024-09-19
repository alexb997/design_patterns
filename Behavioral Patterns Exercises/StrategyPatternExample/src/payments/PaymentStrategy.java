package payments;

public interface PaymentStrategy {
    void pay(double amount, String currency);
    double calculateProcessingFee(double amount);
    boolean processPayment(double amount);
}
