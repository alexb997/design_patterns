import context.PaymentContext;
import payments.*;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment, "USD");

        paymentContext.pay(100.00);

        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.setCurrency("EUR");
        paymentContext.pay(100.00);

        paymentContext.setPaymentStrategy(bitcoinPayment);
        paymentContext.setCurrency("BTC");
        paymentContext.pay(100.00);
    }
}
