package ex2_strategy_pattern;

public class ConsumptionTax implements TaxStrategy{
    @Override
    public Double calculateTax(Product product) {
        return product.getPrice() * 0.01;
    }
}
