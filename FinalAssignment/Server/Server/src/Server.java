import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(6666);
            while(true){
                
                Socket soc = ss.accept();
                Thread thread = new Thread();
                thread.start();
    
                DataInputStream inputStream = new DataInputStream(soc.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(soc.getOutputStream());
                
                  
                    double height = inputStream.readDouble();

                    double weight = inputStream.readDouble();

                    double bmi = weight / (height * height);

                    outputStream.writeDouble(bmi);
        
                }    
                

                
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

