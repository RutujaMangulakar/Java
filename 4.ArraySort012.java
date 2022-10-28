import java.util.*;

class Array
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            // if(sc.nextInt()!=0 || sc.nextInt()!=1 || sc.nextInt()!=2)
            // {
            //     break;
            // }
            arr[i] = sc.nextInt();  
        }
        int temp;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
    }
}