import java.util.*;

class Array{
    public static void main(String rags[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size 1 : ");
        int size = sc.nextInt();
        System.out.println("Size 2 : ");
        int size2 = sc.nextInt();
        int[] firstArray = new int[size];
        int[] secArray = new int[size2];
        for(int i=0;i<size;i++){
            firstArray[i] =sc.nextInt();
        }
        for(int i=0;i<size2;i++){
            secArray[i] =sc.nextInt();
        }
        getUnion(firstArray,secArray);
    }

    static void getUnion(int[] array, int[] array1){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<array1.length;i++)
        {
            // sb.append(array1[i]+" ");
            System.out.print(array1[i]+" ");
        }
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array1.length;j++)
            {
                if(array[i]==array1[j])
                {
                    //sb.append(array[i]+" ");
                     System.out.print(array[i]+" ");
                }
                break;
            }
        }
        //System.out.println(sb.toString());
    }

}