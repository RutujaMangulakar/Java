import java.util.ArrayList;
import java.util.Collections;

class ArrayLists
{
    public static void main(String arg[])
    {
        //creation
        ArrayList<Integer> list = new ArrayList<>();

        //Insertion
        list.add(8);
        list.add(6);
        list.add(2);

        System.out.println(list);

        //Insertion at specific index
        list.add(1,2);
        System.out.println(list);

        //changing element at specific index
        list.set(1,3);
        System.out.println(list);


        //Retrieve
        int ele = list.get(0);
        System.out.println(ele);

        //Deletion at specofic indx
        list.remove(1);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //Interation
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}