import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        try {
            Scanner input = new Scanner(System.in);

            Socket soc = new Socket("localhost", 6666);
 
            DataOutputStream outputStream = new DataOutputStream(soc.getOutputStream());
            DataInputStream inputStream = new DataInputStream(soc.getInputStream());
 
 
            while(true){
                System.out.println("Enter Height in Meters: ");
                double height = input.nextDouble();

                System.out.println("Enter Weight in Kilograms: ");
                double weight = input.nextDouble();
                
                outputStream.writeDouble(height);
                outputStream.writeDouble(weight);
               
                double bmi = inputStream.readDouble();
                System.out.println("BMI: " + bmi);
            }
                
               

        }

        catch (Exception e) {
 
            System.out.println(e);
        }

    }
}
