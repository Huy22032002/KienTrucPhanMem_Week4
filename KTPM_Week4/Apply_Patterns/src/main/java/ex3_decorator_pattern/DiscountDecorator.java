package ex3_decorator_pattern;

public class DiscountDecorator extends PaymentDecorator {
    private double discount;

    public DiscountDecorator(Payment payment, double discount) {
        super(payment);
        this.discount = discount;
    }

    @Override
    public void pay(double amount) {
        double totalAmount = amount - discount;
        System.out.println("Áp dụng mã giảm giá: " + discount);
        payment.pay(totalAmount);
    }
}