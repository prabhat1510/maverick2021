package training.methodref;

import java.util.Comparator;
import java.util.Currency;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

//public abstract class Order {
public class Order{

    //private Currency currency;
    private String currency;
    private double amount;
    private Side side;

    public Order(String currency, double amount, Side side) {
        this.currency = currency;
        this.amount = amount;
        this.side = side;
    }

    public  boolean match(Order order){
        return true;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Order{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                ", side=" + side +
                '}';
    }
}
