/*If tiles of size n*m is given then in how many waystiles of size 1*m 
  can be placed 
 */

 class PlaceTiles
 {
    public static void main(String args[])
    {
        int n=3,m=3;
        System.out.println(getWaysCount(n,m));
        System.out.println(getWaysCount(4,2));        
    }

    static int getWaysCount(int n, int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        int placeVertical = getWaysCount(n-m,m);
        int placeHorizontal = getWaysCount(n-1,m);

        return placeVertical+placeHorizontal;
    }

 }