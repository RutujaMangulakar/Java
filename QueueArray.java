
public class QueueArray
{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty()
        {
            if(rear==-1)
            {
                return true ;
            }
            return false;
        }

        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Full Queue");
                return ;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("No element");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<=rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String rags[])
    {
        Queue q = new Queue(5);
        q.add(2);
        q.add(4);
        q.add(8);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}

