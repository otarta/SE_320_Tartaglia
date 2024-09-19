import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please select which section you would like to run (1 or 2):");
			int selection = input.nextInt();
			if(selection == 1) {
				hw1_1();
			}
			if(selection == 2) {
				hw1_2();
			}
			else {
				System.out.println("Please rerun and choose 1 or 2.");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please input a valid integer");
		}
	}
	
	public static void hw1_1() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("First int: ");
			int num1 = input.nextInt();
			System.out.println("Second int: ");
			int num2 = input.nextInt();	
			int sum = num1+num2;
			System.out.println("Sum of "+num1+" + "+num2+" = "+sum);
			}
		catch(InputMismatchException e){
			System.out.println("Please input a valid integer");
			hw1_1();
		}
		catch(Exception e) {
			System.out.println("The following error has occured");
			System.out.println(e);
			hw1_1();
		}
	}
	
	public static void hw1_2() {
		try (Scanner input = new Scanner(System.in)) {
			Random rand = new Random();
			int [] numArray = new int [100];
			for (int i=0;i<numArray.length;i++) {
				numArray[i]= rand.nextInt(100);
			}
			System.out.println("Please enter an integer between 1-100:");
			int selection = input.nextInt();
			System.out.println("Selection: "+numArray[selection]);
		}
		catch(InputMismatchException e){
			System.out.println("Please input a valid integer");
			hw1_2();
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please choose a number between 1-100.");
			hw1_2();
		}
		catch(Exception e) {
			System.out.println("The following error has occured");
			System.out.println(e);
			hw1_2();
		}
	}

}
