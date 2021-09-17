package utility;

import java.util.ArrayList;
import java.util.List;

public class Junit5Example {
        List<String> list;
    public String firstMethod(){
        //System.out.println("First Method implemented");
        String message = "Hello";
        int count =0;
        if(count>=0){
            count++;
            //return  message;
        }else{
            message = null;
        }
        return message;
    }

    public void secondMethod(String message){
        /**
        String message =firstMethod();
        message=null;***/
         list = new ArrayList<>();
         list.add(message);
    }
}
