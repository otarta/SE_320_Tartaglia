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



/*
 * requires: lst is not null
 *           all elements of lst must be of the same type
 *           elements of lst must be sorted
 */
public static void removeDuplicates(List lst) {
    if (lst == null || lst.size() == 0) return;
    List copy = new ArrayList(lst);
    Iterator elements = copy.iterator();
    Object pre = elements.next();
    while(elements.hasNext()) {
    Object nex = elements.next();
    if (pre.equals(nex)) lst.remove(nex);
    else pre = nex;
    }
    }
}