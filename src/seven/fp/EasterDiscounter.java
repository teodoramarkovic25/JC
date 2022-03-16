package seven.fp;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {


    @Override
    public double applyDiscount(double amount) {
        double discountedAmount = amount - 1 * amount;
        return discountedAmount;
    }
}
