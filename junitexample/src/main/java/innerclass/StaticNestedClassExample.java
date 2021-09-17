package innerclass;

public class StaticNestedClassExample {


    private String name;
    private static String greetings="Good Evening";

    static class InnerStaticClass{
        private static String greeting="Bye Bye Now !!!";
        void displayMessage(){
            System.out.println("variable greetings value is ---"+greetings);
        }
    }

    public static void main(String[] args){
        StaticNestedClassExample.InnerStaticClass staticNestedClassExample = new StaticNestedClassExample.InnerStaticClass();
        staticNestedClassExample.displayMessage();
        String msg = InnerStaticClass.greeting;
        System.out.println(InnerStaticClass.greeting);
    }
}
