import java.util.*;

class Number{
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder obj = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int temp;
        for(int i=0;i<size;i++){
            temp = sc.nextInt();
            if(temp<0){
                obj.append(temp+" ");
            }
            else{
                sb.append(temp+" ");
            }
        }
        System.out.print(obj.toString());
        System.out.println(sb.toString());
    }
}