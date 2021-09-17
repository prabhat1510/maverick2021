package innerclass;

import org.springframework.cglib.core.Local;

public class LocalInnerClassExample {
    private static String msg = "Hello Good Evening";
    public static void main(String[] args){
    LocalInnerClassExample localInnerClassExample = new LocalInnerClassExample();
    localInnerClassExample.printMessage();



    }
//Local Inner class with in the method
    void printMessage(){

        class LocalInner{
            void message(){
                System.out.println(msg);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.message();

    }


}
