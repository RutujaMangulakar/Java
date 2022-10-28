import java.util.*;
import java.text.*;

class Paint{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int intWall = sc.nextInt();
        int extWall = sc.nextInt();
        DecimalFormat f = new DecimalFormat("#.##");
        //int intRate =18, extRate=12;
        float cost =0;
         float intSurfaceArea;
         float extSurfaceArea;
        for(int i=0;i<intWall;i++){
            intSurfaceArea = sc.nextFloat();
            cost += intSurfaceArea*18;
        }
        for(int i=0;i<extWall;i++){
            extSurfaceArea = sc.nextFloat();
            cost += extSurfaceArea*12;
        }
        String result = f.format(cost);
        System.out.println( result+" INR");
        sc.close();
    }
}