import java.util.*;

class Number
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Number.sort(arr,key);
    }

    static void sort(int[] arr, int k)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(k+"th min : "+arr[k-1]);
        System.out.println(k+"th max : "+arr[arr.length-k]);
    }
}