import payment.CreditCardPayment;
import payment.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        paymentSystem.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        paymentSystem.executePayment(100.00);

        paymentSystem.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentSystem.executePayment(200.00);
    }
}