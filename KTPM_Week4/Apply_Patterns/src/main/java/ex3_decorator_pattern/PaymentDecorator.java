package ex3_decorator_pattern;

public class PaymentDecorator implements Payment{
    protected Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void pay(double totalPrice) {
        payment.pay(totalPrice);  // Gọi phương thức thanh toán của đối tượng gốc
    }
}
