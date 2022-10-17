/*How many paths are there to move from (0,0) to (n-1,m-1) in a
  matrix of size n*m 
*/

class TotalPaths
{
    public static void main(String args[])
    {
        int n = 3, m =3;
        System.out.println(calPaths(0,0,n,m));
    }

    static int calPaths(int i, int j, int n, int m)
    {
        if(i == n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        int downPaths = calPaths(i+1,j,n,m);
        int rightPaths = calPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }
}