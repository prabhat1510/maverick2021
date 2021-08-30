package training.methodref;

import java.util.Currency;

public class MarketOrder extends Order {
    public MarketOrder(Currency currency, double amount, Side side) {
        super(currency, amount, side);
    }

    @Override
    public boolean match(Order order) {
        return false;
    }

}
