package payments;

public class CurrencyConverter {

    public static double convertToPreferredCurrency(double amount, String currency) {
        switch (currency.toUpperCase()) {
            case "USD":
                return amount;
            case "EUR":
                return amount * 0.85;
            case "GBP":
                return amount * 0.75;
            default:
                throw new IllegalArgumentException("Unsupported currency: " + currency);
        }
    }
}
