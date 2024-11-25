import java.time.LocalDate;
import java.util.Scanner;
public class HW5 {
    public static void main(String[] args) throws Exception {
        try{
        LocalDate todayUnformatted = LocalDate.now();
        Day today = new Day(todayUnformatted.getYear(),todayUnformatted.getMonthValue(),todayUnformatted.getDayOfMonth());
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth Year:");
        int birthYear = input.nextInt();
        System.out.println("Enter your birth Month:");
        int birthMonth = input.nextInt();
        System.out.println("Enter your birth Day:");
        int birthDay = input.nextInt();

        input.close();

        Day birthDate = new Day(birthYear, birthMonth, birthDay);

        System.out.println("There have been "+today.daysFrom(birthDate)+ " days since you were born.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
