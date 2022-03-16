package five.oop;

public class MilkDecorator extends Beverage{

    private Beverage beverage;
    public MilkDecorator(Beverage beverage) {
        super(beverage.getName() + "sa mlijekom");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
