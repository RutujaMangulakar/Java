import java.util.*;

public class Selection_Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] sort_array = new int[size];
        for(int i=0;i<size;i++)
        {
            sort_array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sort_array));
        selection_sort(sort_array);
        System.out.println(Arrays.toString(sort_array));
    }

    static void selection_sort(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            int last = array.length-i-1;
            int max_ele = get_max(array,0,last);
            swap(array,array[last],max_ele);
        }
    }

    static void swap(int[] arr , int first,int second)
    {
        int temp=first;
        first=second;
        second=temp;
    }
    static int get_max(int[] arr, int start, int end)
    {
        int max = arr[start];
        for(int i=start;i<end-1;i++)
        {
            int max_ele=Math.max(arr[i],arr[i+1]);
            max=Math.max(max,max_ele);
        }
        return max;
    }
}