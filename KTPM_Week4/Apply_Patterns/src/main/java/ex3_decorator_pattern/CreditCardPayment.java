package ex3_decorator_pattern;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount);
    }
}
