import java.util.*;
public class Bubble_Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] sort_array = new int[size];
        for(int i=0;i<size;i++)
        {
            sort_array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sort_array));
        bubble(sort_array);
        System.out.println(Arrays.toString(sort_array));
    }

    static void bubble(int[] array)
    {
        boolean swapped;
        int n = array.length;
        for(int i=0;i<n;i++)
        {
            swapped = false;
            //for each step max will come at the last respective index
            for(int j=1;j<(n-i);j++)
            {
                //condition check
                if(array[j]<array[j-1])
                {
                    //swapping
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
             {
                 break;
             }
        }
    }
}