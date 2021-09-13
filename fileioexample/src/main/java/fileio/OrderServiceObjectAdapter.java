package fileio;

public class OrderServiceObjectAdapter implements BugerOrder{
    private OrderService adaptee;

    public OrderServiceObjectAdapter(OrderService adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void orderBurger(int quantity) {
        adaptee.orderBurger(quantity);

    }
}
