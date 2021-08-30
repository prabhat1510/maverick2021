package training.methodref;

import java.util.Currency;

public abstract class Order {

    private Currency currency;
    private double amount;
    private Side side;

    public Order(Currency currency, double amount, Side side) {
        this.currency = currency;
        this.amount = amount;
        this.side = side;
    }

    public abstract boolean match(Order order);

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
