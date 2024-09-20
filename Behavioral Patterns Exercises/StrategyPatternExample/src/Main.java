import context.PaymentContext;
import payments.*;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment, "USD");

        System.out.println("Step 1: Paying with Credit Card.");
        paymentContext.pay(100.00);

        System.out.println("\nStep 2: Paying with PayPal.");
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.pay(200.00);

        System.out.println("\nStep 3: Paying with Bitcoin.");
        paymentContext.setPaymentStrategy(bitcoinPayment);
        paymentContext.setCurrency("BTC");
        paymentContext.pay(300.00);

        System.out.println("\nStep 4: Simulate PayPal failure, retry with Credit Card.");
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.setCurrency("USD");
        if (!paymentContext.attemptPayment(150.00)) {
            System.out.println("Switching to Credit Card as fallback.");
            paymentContext.setPaymentStrategy(creditCardPayment);
            paymentContext.pay(150.00);
        }

        System.out.println("\nStep 5: Paying in EUR.");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.setCurrency("EUR");
        paymentContext.pay(100.00);
    }
}
