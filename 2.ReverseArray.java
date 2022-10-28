import java.util.*;

class Reverse_Array
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("No. of elements : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+(i+1)+" th : ");
            arr[i]=s.nextInt();
        }
        System.out.print("[ ");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.print(" ]");

        System.out.print("\n[ ");
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.print(" ]");
    }
}