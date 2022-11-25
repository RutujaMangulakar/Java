import java.util.*;

class Sort
{
    public static void main(String args[])
    {
        int[] arr ={0,0,1,2,1,2,0,0,2};
        int[] sorted = new int[arr.length];
        int zero=0,one=0,two=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            if(arr[i]==1)
            {
                one++;
            }
            if(arr[i]==2)
            {
                two++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<zero)
            {
                sorted[i]=0;
            }
            if(i>=zero && i<zero+one)
            {
                sorted[i] = 1;
            }
            if(i>=zero+one)
            {
                sorted[i] = 2;
            }
        }
        System.out.println(Arrays.toString(sorted));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}