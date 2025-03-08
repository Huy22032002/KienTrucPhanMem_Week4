package ex3_decorator_pattern;

public class PaypalPayment implements Payment{

    @Override
    public void pay(double totalPrice) {
        System.out.println("Thanh toán qua Paypal: " + totalPrice);
    }
}
