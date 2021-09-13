package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * Demostrates serialization and deserialization
 * @author pchandra
 *
 */
public final class SerializationDemo
{
    /**
     * Persists a list of {@link Person} to a file.
     * @param list
     * @param filename
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void store(List<Person> list, String filename) throws
            FileNotFoundException, IOException
    {
        try(ObjectOutputStream outstream =
                    new ObjectOutputStream(new FileOutputStream(filename));)
        {
            outstream.writeObject(list);
        }
    }


    /**
     * Loads a list of {@link Person} from a file
     * @param filename
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */

    @SuppressWarnings("unchecked")
    public static List<Person> load(String filename)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        try(ObjectInputStream instream =
                    new ObjectInputStream(new FileInputStream(filename));)
        {
            return (List<Person>)instream.readObject();
        }
    }
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Usage: java module6.SerializationDemo filename");
                    System.exit(-1);
        }

        // Getting the list ready
        Person p1 = new Person("Karl Pearson", 79, "United Kingdom");
        Person p2 = new Person("John Tukey", 85, "United States");

        Vector<Person> inList = new Vector<Person>();
        inList.add(p1);
        inList.add(p2);

        try {
            //File file = new File("C:\\\\Users\\\\admi\\\\Documents\\\\GitHub\\\\maverick2021\\\\daynine1\\Person.txt");
            // Store the list to a file
            //SerializationDemo.store(inList, args[0]);
            System.out.println("**********Reading list from a file **************");
            // Load the list from a file

            List<Person> outList = SerializationDemo.load(args[0]);
            for (Person p : outList)
                System.out.println(p.toString());

            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            System.out.println("Input is -----" + i);
            //String words =sc.next();
            //System.out.println("Word is -----"+words);
            //String word =sc.next();
            /*StringBuffer stringBuffer = new StringBuffer();
            while(sc.hasNext()){
                stringBuffer.append(sc.nextLine());
            }*/
            Scanner sc = new Scanner(System.in).useDelimiter("\\n");
            String word = sc.next();
            System.out.println(word);
            System.out.println("Word is ----" + word);
            File file = new File("C:\\Users\\admi\\Documents\\GitHub\\maverick2021\\daynine1\\greetings.txt");
            Scanner scanner = new Scanner(file);
            StringBuffer stringBuffer = new StringBuffer();
            while (scanner.hasNext()) {
               stringBuffer.append("   "+scanner.nextLine());
                //System.out.println(scanner.nextLine());
            }
            System.out.println("****************************");
            System.out.println(stringBuffer);


        }
       catch (IOException | ClassNotFoundException e)
       // catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

