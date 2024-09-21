import context.PaymentContext;
import payments.*;

public class Main {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment(), new Discount(10), "EUR");

        try {
            paymentContext.processPayment(100);
            
            paymentContext.setPaymentStrategy(new PayPalPayment(false));
            paymentContext.processPayment(200);
    
            paymentContext.setPaymentStrategy(new PayPalPayment(true));
            paymentContext.processPayment(300);
    
            paymentContext.setPaymentStrategy(new BitcoinPayment());
            paymentContext.processPayment(300);
        } catch (PaymentException e) {
            e.printStackTrace();
        }

        
    }
}