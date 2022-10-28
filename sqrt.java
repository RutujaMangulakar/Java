//Newton Rapson Formula
class Sqrt
{
    public static void main(String args[])
    {
        int n=40;
        System.out.println(sqrt(n));
    }
    static int sqrt(int n)
    {
        if(n==1)
        {
            return 1;
        }
        long i=n;
        while(i>n/i)
        {
            i = (i+n/i)/2;
        }
        return (int)i;
    }
}