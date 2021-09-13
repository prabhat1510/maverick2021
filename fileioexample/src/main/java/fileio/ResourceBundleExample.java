package fileio;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {


    public static void main(String[] args){
        //Locale locale = new Locale("en","US");
        Locale locale = new Locale("fr","Fr");
        ResourceBundle labels = ResourceBundle.getBundle("message",locale);
        System.out.println(labels.getString("Login"));
        /**
        Locale loc = new Locale("de","DE");
        ResourceBundle bundle= ResourceBundle.getBundle(String.valueOf(EuropeanCountries_de.class));
        System.out.println(bundle.getObject("price"));**/
        System.out.println("*************************");
        ResourceBundle bundle = ResourceBundle.getBundle("application");
        System.out.println(bundle.getString("server.port"));

    }
}
