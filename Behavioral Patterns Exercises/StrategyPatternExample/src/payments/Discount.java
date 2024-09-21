package payments;

public class Discount {
    private double discountPercentage;

    public Discount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double applyDiscount(double amount) {
        double discountAmount = amount * (discountPercentage / 100);
        System.out.println("Applying " + discountPercentage + "% discount: -" + discountAmount);
        return amount - discountAmount;
    }
}