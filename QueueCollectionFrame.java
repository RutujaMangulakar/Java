import java.util.*;

class QueueLL{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        //Anyone of them can be prefered, differences are on cache 
        //Queue<Integer> q = new ArrayDeque<>();
        q.add(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(7);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}