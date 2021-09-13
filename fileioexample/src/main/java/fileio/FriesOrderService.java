package fileio;

public class FriesOrderService implements OrderService{

    @Override
    public void orderBurger(int quantity) {
        throw new UnsupportedOperationException("No burger in fries only order");
    }


    public void orderFries(int fries) {
        System.out.println("Recieved order of "+fries+" fries");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in fries only order");
    }
}
