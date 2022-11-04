/*
 * * * * * * 
  * * * * *
   * * * *
    * * *
     * *
      *
*/

import java.util.*;

class ArrayPattern7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            int totalColsInRow = i;
            int noOfSpaces = n -i;
            for(int s = 0;s<=noOfSpaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=totalColsInRow;j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}