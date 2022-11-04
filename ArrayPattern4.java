/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/
import java.util.*;

class ArrayPattern4
{
    public static void main(String rags[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=2*n-1;i++)
        {
            int col ;
            if(i<=n)
            {
                col = i;
            }
            else
            {
                col = 2*n-i;
            }
            for(int j=0;j<col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
}