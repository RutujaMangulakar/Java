import java.util.*;

class Demo
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int size = sc.nextInt();
        System.out.println("m : ");
        int m = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[m-1]-arr[0];
        for(int i=0;i+m-1<size;i++)
        {
            if((arr[i+m-1]-arr[i])<min);
            min = arr[i+m-1]-arr[i];
        }
        System.out.println("Min : "+min);
    }
}