package fileio;

public class BurgerOrderService implements  OrderService{


    public void orderBurger(int quantity) {
        System.out.println("Recieved order of "+quantity+" burgers");
    }

    @Override
    public void orderFries(int fries) {
        //System.out.println("Recieved order of "+fries+" fries");
        throw new UnsupportedOperationException("No fries in burger only order");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in burger only order");
    }
}
