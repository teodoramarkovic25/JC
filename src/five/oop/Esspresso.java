package five.oop;

public class Esspresso extends Beverage{


    public Esspresso() {
        super("Esspresso");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
