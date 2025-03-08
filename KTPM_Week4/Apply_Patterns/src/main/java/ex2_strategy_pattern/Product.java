package ex2_strategy_pattern;

public class Product {
    private String name;
    private int count;

    private TaxStrategy taxStrategy;
    private double price;

    public Product(String name, int count, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(){
        return taxStrategy.calculateTax(this);
    }

    public Product(){}

    public double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
