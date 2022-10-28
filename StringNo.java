import java.util.*;

class MyString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        input = input.toLowerCase();
        int count=1;
        int arr[] = new int[26];
        for(int i=0;i<input.length();i++)
        {
           arr[input.charAt(i)-97] +=1;
        }
        
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                System.out.printf("%c%d",(i+97),arr[i]);
            }
        }
        
    }
}