package fileio;

import java.math.BigDecimal;
import java.util.ListResourceBundle;

public class EuropeanCountries_de extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    //public static String currency = "EUR";
    //public static String language = "de";

    private Object[][] contents = {
            {"taxRate" , new BigDecimal(18.50)},{"currency","DE"}
    };
}
