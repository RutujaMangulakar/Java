import java.util.*;

class MaxMin
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of elements : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+i+" th element : ");
            arr[i]=s.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.print("]");
        Main obj = new Main();
        System.out.println("\nMax element : "+obj.Max(arr,size));
        System.out.println("Min element : "+obj.Min(arr,size));
    }
}

class Main
{
     public int Max(int[] arr, int size)
    {
        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

     public int Min(int[] arr, int size)
    {
        int min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[0]>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}