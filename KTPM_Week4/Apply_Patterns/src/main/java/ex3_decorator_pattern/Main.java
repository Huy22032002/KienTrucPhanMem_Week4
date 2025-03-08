package ex3_decorator_pattern;

public class Main {
    public static void main(String[] args) {
        // Thanh toán bằng thẻ tín dụng mà không có phí hoặc mã giảm giá
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(100);

        // Thanh toán bằng PayPal với phí xử lý
        Payment paypalPayment = new PaypalPayment();
        paypalPayment = new ProcessingFeeDecorator(paypalPayment, 5);
        paypalPayment.pay(200);

        // Thanh toán bằng thẻ tín dụng với phí xử lý và mã giảm giá
        Payment creditCardWithDiscount = new CreditCardPayment();
        creditCardWithDiscount = new ProcessingFeeDecorator(creditCardWithDiscount, 3);  // Thêm phí xử lý
        creditCardWithDiscount = new DiscountDecorator(creditCardWithDiscount, 10);  // Thêm mã giảm giá
        creditCardWithDiscount.pay(150);
    }
}
