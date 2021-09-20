package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

	
public class Demo2 {
	public static void main(String args[]) throws ParseException {
	SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
    Date d1 = df.parse("20:10:30"); //date 1
    Date d2 = df.parse("5:10:30"); // date 2
    long sum = d1.getTime() + d2.getTime();
    System.out.println(sum);
    System.out.println(df.format(new Date(sum)));  
	}
}
