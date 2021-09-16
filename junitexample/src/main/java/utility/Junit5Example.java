package utility;

public class Junit5Example {

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

    public void secondMethod(){
        String message =firstMethod();
        message=null;
    }
}
