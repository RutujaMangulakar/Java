/*In how many ways one can call n geusts(single && pair) */

class CallGuest
{
    public static void main(String args[])
    {
        int n =4;
        System.out.println(callGuest(n));
    }

    static int callGuest(int n)
    {
        if(n<=1)
        {
            return 1;
        }

        int single = callGuest(n-1);
        int pair = (n-1)*callGuest(n-2);
        return single+pair;
    }
}