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

class ArrayPattern5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=2*n-1;i++)
        {
            int totalColsInRows = (i>n)?2*n-i:i;
            int noOfSpaces =  n - totalColsInRows;
            for(int j=0;j<noOfSpaces;j++)
            {
                System.out.print(" ");
            }
            for(int col =0;col<totalColsInRows;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}











