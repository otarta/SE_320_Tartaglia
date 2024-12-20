import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TreeSet;
public class HW4 {
    public static void main(String[] args) throws Exception 
    {
        Question2();
    }



    public static void Question1()
    {
        LinkedHashSet<String> hash1 = new LinkedHashSet<String>();
        LinkedHashSet<String> hash2 = new LinkedHashSet<String>();

        hash1.add("George");
        hash1.add("Jim");
        hash1.add("John");
        hash1.add("Blake");
        hash1.add("Kevin");
        hash1.add("Michael");

        hash2.add("George");
        hash2.add("Katie");
        hash2.add("Kevin");
        hash2.add("Michelle");
        hash2.add("Ryan");


        LinkedHashSet<String> union = new LinkedHashSet<String>(hash1);
        union.addAll(hash2);

        LinkedHashSet<String> intersection  = new LinkedHashSet<String>(hash1);
        union.retainAll(hash2);
        
        LinkedHashSet<String> difference = new LinkedHashSet<String>(hash1);
        union.removeAll(hash2);
        
        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);
    }

    public static void Question2() 
    {
       
        try( BufferedReader br = new BufferedReader(new FileReader("question2.txt"));)
        {
            TreeSet<String> wordSet = new TreeSet<String>();
            String line;
            while ((line = br.readLine())!= null)
            {
                String[] words = line.split("\\s+");
                for(String word : words)
                {
                    wordSet.add(word);
                }
            }
            System.out.println(wordSet);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("Error reading file ");
        }
        catch(Exception e)
        {
            System.out.println("An error has occurred");
        }
    }

    //used suppress warnings so that ugly yellow lines went away
    @SuppressWarnings("deprecation")
    public static void Question3()
    {
        Locale enUS = new Locale("en", "US");
        Locale enGB = new Locale("en", "GB");

        NumberFormat ukNumbers = NumberFormat.getInstance(enGB);

        double number = 12345.678;
        String numbeString = "12345.678";

        String formattedNumber_3_a = ukNumbers.format(number);
        String formattedNumber_3_b = NumberFormat.getCurrencyInstance(enUS).format(number);
        double formattedNumber_3_c = Double.parseDouble(numbeString);

        System.out.println(formattedNumber_3_a);
        System.out.println(formattedNumber_3_b);
        System.out.println(formattedNumber_3_c);

    }
}
