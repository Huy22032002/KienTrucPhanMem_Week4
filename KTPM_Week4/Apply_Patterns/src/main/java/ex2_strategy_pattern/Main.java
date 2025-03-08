package ex2_strategy_pattern;

public class Main {
    public static void main(String[] args){
        Product product = new Product("Cocacola", 2, 10000.0, new ConsumptionTax());
        System.out.println( product.getName() + " tax is: " + product.calculateTax());

        Product product2 = new Product("Iphone11 Pro", 1, 10000000.0, new VATTax());
        System.out.println(product2.getName() + " tax is: " + product2.calculateTax());

        Product product3 = new Product("Mercedes", 1, 25000000.0, new LuxuryTax());
        System.out.println(product.getName() + " tax is: " + product3.calculateTax());

    }
}
