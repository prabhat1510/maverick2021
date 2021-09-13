package fileio;

public class MainClient {

    public static void main(String[] args){
        OrderService orderService;
        BugerOrder burgerOrder = new OrderServiceObjectAdapter(new BurgerOrderService());
        burgerOrder.orderBurger(4);


    }
}
