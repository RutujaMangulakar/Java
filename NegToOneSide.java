import java.util.*;

class Sort
{
    public static void main(String args[])
    {
        int[] arr ={-3,4,-1,0,-9,8,5,-1};
        int[] sorted = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                sorted[j++] = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                sorted[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(sorted));
    }
}