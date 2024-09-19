import java.util.InputMismatchException;
import java.util.Scanner;
public class vsCodeTest {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number1 = input.nextInt();
            System.out.println("Enter another number: ");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.println("Sum : " + sum);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
