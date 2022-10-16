import java.util.HashSet;
import java.util.Iterator;
class Hashing
{
    public static void main(String args[])
    {
        //creation
        HashSet<Integer> set = new HashSet<>();

        //Insertion
        set.add(23);
        set.add(24);
        set.add(34);
        System.out.println("Set elements : "+set);
        System.out.println("Set size : "+set.size());
        //Searching 
        if(set.contains(24))
        {
            System.out.println("Set contains 24");
        }
        else
        {
            System.out.println("Set does not contains 24");
        }

        //Deletion
        set.remove(24);
        System.out.println("Set elements : "+set);

        //Iterator
        Iterator iter = set.iterator(); 
        // initially iter points to null  
        //Iterator has 2 functions hasNext , Next

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}