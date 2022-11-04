/*
     *
    * *
   * * *
  * * * *
 * * * * *

*/

import java.util.*;

class ArrayPattern6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int totalColsInRows = i;
            int noOfSpaces = n-i;
            for(int j=0;j<noOfSpaces;j++)
            {
                System.out.print(" ");
            }
            for(int col =0;col<=totalColsInRows;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}