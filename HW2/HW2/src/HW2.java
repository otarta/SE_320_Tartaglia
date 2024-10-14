import java.util.ArrayList;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) throws Exception 
    {
        
    }
        //1
        //in the GenericStack Class 



        //2
        public void question2()
        {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList);
        }
        public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
        {
            ArrayList<E> newList = new ArrayList<>();

            for (E element : list) 
            {
                if (!newList.contains(element))
                {
                    newList.add(element);
                }
            }
            return newList;
        }
        
        //3
        public void question3()
        {
            Scanner scannerA = new Scanner(System.in);
            try
            {
            int inputNumber = scannerA.nextInt();

            assert (inputNumber >= 0 && inputNumber<=10) : "The number is out of range" ;

            System.out.println("The inputted number is: "+inputNumber);
            }
            catch(Exception e)
            {
                System.out.println("An error occurred. Please try again");
                question3();
            }
            finally
            {
                scannerA.close();
            }
        }



    }        
       








    

