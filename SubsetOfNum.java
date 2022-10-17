/*Print all subsets of first n natutal numbers */
import java.util.ArrayList;
class SubsetOfNum
{
    public static void main(String ard[])
    {
        ArrayList<Integer> subset = new ArrayList<>();
        int n= 5;
        findSubset(n,subset);
    }

    static void findSubset(int n, ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printSubset(subset);
            return ;
        }

        //If element wants to participate
        subset.add(n);
        findSubset(n-1,subset);

        //If element don't want to participate
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }

    static void printSubset(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
}