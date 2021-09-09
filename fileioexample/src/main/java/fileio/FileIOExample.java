package fileio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileIOExample {

    public static void main(String[] args){
        String directoryName =  "C:\\Users\\admi\\Documents\\GitHub\\maverick2021\\dayeight";
        File directory = new File(directoryName);
        System.out.println(directory.listFiles().length);
        System.out.println(directory.length());
        System.out.println(directory.list());
        System.out.println(directory.canRead());
        System.out.println(directory.canWrite());
        if(directory.isDirectory()){
            System.out.println("Its a directory");
        }else if(directory.exists()){
            System.out.println("Directory Exists");
        }else{
            directory.mkdir();
        }
        String fileName =  "C:\\Users\\admi\\Documents\\GitHub\\maverick2021\\daynine1\\greetings.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.getCanonicalPath());
            System.out.println(new Date(file.lastModified()));
            long date= file.lastModified();
            DateFormat sdf
                    = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
            System.out.println("modified date is : "
                    + sdf.format(date));

            //System.out.println(file.delete());
           // PrintWriter  printWriter = new PrintWriter(new FileWriter(new File("C:\\Users\\admi\\Documents\\GitHub\\maverick2021\\daynine1\\greetings.txt")));
            PrintWriter  printWriter = new PrintWriter(new FileWriter(fileName,true));
            Person p1 = new Person("Rakesh",32,"Chennai");
            Person p2 = new Person("Rajesh",25,"Hyderabad");
            Person p3 = new Person("Ritu",33,"Pune");
            Person p4 = new Person("Rakul",27,"Mumbai");

            List<Person> persons = new ArrayList<>();
            persons.add(p1);
            persons.add(p2);
            persons.add(p3);
            persons.add(p4);
            for(Person person: persons) {
                printWriter.print(person);
               // printWriter.write(person);
            }
           // printWriter.println("Hello IO Stream");
            //printWriter.append("Hello IO Stream");
            printWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            //List<Person> personList = new ArrayList<>();
            String currentPerson = null;

            while((currentPerson = bufferedReader.readLine())!=null) {
                System.out.println(currentPerson);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
