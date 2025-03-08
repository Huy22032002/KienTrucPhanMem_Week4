package ex3_decorator_pattern;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private double fee;

    public ProcessingFeeDecorator(Payment payment, double fee) {
        super(payment);
        this.fee = fee;
    }

    @Override
    public void pay(double amount) {
        double totalAmount = amount + fee;
        System.out.println("Thêm phí xử lý: " + fee);
        payment.pay(totalAmount);
    }
}