package innerclass;

public class AnonymousInnerClassExample {
    /**
     * 1. Class(may be abstract or concrete
     * 2. Interface
     */

    public static void main(String[] args) {

        //Implementation of Anonymous Inner Class using Interface
        PrintInterface pi = new PrintInterface() {
            @Override
            public void display() {
                System.out.println("Mayur knows Inner Class");
            }

            @Override
            public boolean isDisplayed() {
                return false;
            }
        };
        pi.display();
        System.out.println(pi.isDisplayed());


        //Implementation of Anonymous Inner Class using abstract calss
    PrintMessage pm = new PrintMessage() {
        @Override
        void printMessage() {
            System.out.println("Print the Message----");
        }
    };
    pm.printMessage();
}

}
//Implementation of Anonymous Inner Class using Interface
interface PrintInterface{
    void display();
    boolean isDisplayed();

}
//Implementation of Anonymous Inner Class using abstract
abstract  class PrintMessage{
    abstract  void printMessage();
}

