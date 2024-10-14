import java.util.ArrayList;
public class HW2 {
    public static void main(String[] args) throws Exception {
       
        //1

        //2

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






    }

