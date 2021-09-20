package threadexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepExample {

    public static void main(String[] args) {
        List<String> seasonList = new ArrayList<>();
        seasonList = Arrays.asList(new String[]{
                "Winter",
                "Summer",
                "Spring",
                "Autumn"
        });

        for(String value : seasonList){
            //Pause it by 4 seconds
            try{
                Thread.sleep(4000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

            System.out.print(value);
        }
    }
}
