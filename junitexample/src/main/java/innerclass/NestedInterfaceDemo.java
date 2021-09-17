package innerclass;

public class NestedInterfaceDemo implements ParentInterface.ChildInterface {

    public static void main(String[] args) {
    ParentInterface.ChildInterface msg = new NestedInterfaceDemo();
    msg.displayChildMessage();

    }

    @Override
    public void displayChildMessage() {
        System.out.println("Hello Nested Interface Demo- Inside display Child Message method");
    }
}
